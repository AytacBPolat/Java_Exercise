import java.util.Random;
import java.util.Scanner;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    boolean isWeightCheck(){
        return((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    int coinToss(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int result = rand.nextInt(2);
        int winner = -1;
        while(true){
            System.out.println("Heads or tails ? \t 0-Tails 1-Heads");
            int selection = input.nextInt();

            if(selection == 0 || selection == 1){
                if(selection == result){
                    System.out.println("You won the coin toss. Get ready to start.");
                    winner = 0;
                } else {
                    System.out.println("You lost the coin toss. Get ready for your opponent's move.");
                    winner = 1;
                }
                break;
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return winner;
    }


    void run(){
        if(isWeightCheck()){
            int winner = coinToss();
            Fighter attacker, defender;
            if(winner == 0){
                attacker = f1;
                defender = f2;
            } else {
                attacker = f2;
                defender = f1;
            }

            System.out.println(attacker.name + " starts the fight!");

            while(this.f1.health > 0 && this.f2.health > 0){
                defender.health = attacker.hit(defender);
                System.out.println(attacker.name + " hits! " + defender.name + " remaining health: " + defender.health);

                if(defender.health <= 0){
                    System.out.println(attacker.name + " won the match!");
                    break;
                }
                Fighter temp = attacker;
                attacker = defender;
                defender = temp;
            }

        } else {
            System.out.println("Current weight status is insufficient for the competition to begin.");
        }
    }
}
