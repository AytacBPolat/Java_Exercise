import java.util.Scanner;
import java.util.ArrayList;

public class Transpose {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        int rows = 3;
        int cols = 4;
            for (int i = 0; i < rows; i++) {
           matrix.add(new ArrayList<>());
           for (int j = 0; j < cols; j++) {
           matrix.get(i).add(i+j);}
            }
                System.out.println("Before the transposition : ");
                    for (int i = 0; i < rows; i++) {
                    System.out.println(matrix.get(i));
                }

        for(int i = 0; i <cols; i++){
            transpose.add(new ArrayList<>());
            for(int j = 0; j < rows; j++){
                transpose.get(i).add(matrix.get(j).get(i));
            }
        }
                System.out.println("After the transposition : ");
                for(int j = 0; j < cols; j++){
                    System.out.println(transpose.get(j));
                }
    }
}
