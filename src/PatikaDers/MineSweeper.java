import java.util.*;

public class MineSweeper {
    static char[][] grid;
    static char[][] hidden;
    static int openedCells = 0;
    static int mineNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the MineSweeper!");

        System.out.print("Please enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = sc.nextInt();

        while (true) {
            grid = new char[rows][columns];
            hidden = new char[rows][columns];
            openedCells = 0;

            putMines(rows, columns);
            hideBoard(rows, columns);

            boolean gameRunning = true;
            while (gameRunning) {
                printBoard(hidden);
                System.out.print("Please enter row coordinate: ");
                int r = sc.nextInt();
                System.out.print("Please enter column coordinate: ");
                int c = sc.nextInt();

                gameRunning = reveal(r, c);
            }

            System.out.println("Do you want to play again? (y/n)");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }

    static void putMines(int rows, int cols) {
        int total = rows * cols;
        mineNumber = total / 4;

        for (int i = 0; i < rows; i++) {
            Arrays.fill(grid[i], '-');
        }

        Random rand = new Random();
        Set<String> used = new HashSet<>();

        while (used.size() < mineNumber) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            String pos = r + "," + c;
            if (!used.contains(pos)) {
                grid[r][c] = '*';
                used.add(pos);
            }
        }
    }

    static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void hideBoard(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            Arrays.fill(hidden[i], '-');
        }
    }

    static boolean reveal(int r, int c) {
        if (hidden[r][c] != '-') return true;

        if (grid[r][c] == '*') {
            hidden[r][c] = '*';
            printBoard(hidden);
            System.out.println("You hit a mine! Game over.");
            return false;
        } else {
            int mineCount = showNearby(r, c);
            hidden[r][c] = (char) ('0' + mineCount);
            openedCells++;

            if (openedCells == (grid.length * grid[0].length - mineNumber)) {
                printBoard(hidden);
                System.out.println("Congratulations! You won!");
                return false;
            }

            if (mineCount == 0) {
                int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
                int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
                for (int i = 0; i < 8; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) {
                        reveal(nr, nc);
                    }
                }
            }
            return true;
        }
    }

    static int showNearby(int r, int c) {
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) {
                if (grid[nr][nc] == '*') {
                    count++;
                }
            }
        }
        return count;
    }
}
