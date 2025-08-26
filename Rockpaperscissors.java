//import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {

    public static void main(String[] args) {

        int userChoice,randomNumber;

        System.out.println("WELCOME TO GAME");
        System.out.println("--------------------");
        System.out.println("1.ROCK\n2.PAPER\n3.SCISSORS");
        System.out.print("\nENTER YOUR CHOICE(1/2/3): ");

        String[] computerChoice={"ROCK","PAPER","SCISSORS"};

        randomNumber=(int)Math.floor(Math.random()*3);
        
        try (Scanner input = new Scanner(System.in)) {
            userChoice=input.nextInt();
        }

        System.out.printf("\nYOUR CHOICE IS %s",computerChoice[userChoice-1]);
        System.out.printf("\nMY CHOICE IS %s",computerChoice[randomNumber]);

        System.out.print("\n--------------------");
        if (computerChoice[userChoice-1]=="ROCK" && computerChoice[randomNumber]=="SCISSORS") {
            System.out.println("\nYOU WIN!");
        }
        else if (computerChoice[userChoice-1]=="SCISSORS" && computerChoice[randomNumber]=="PAPER") {
            System.out.println("\nYOU WIN!");
        }
        else if (computerChoice[userChoice-1]=="PAPER" && computerChoice[randomNumber]=="ROCK") {
            System.out.println("\nYOU WIN!");
        }
        else if (computerChoice[userChoice-1]=="ROCK" && computerChoice[randomNumber]=="ROCK") {
            System.out.println("\nDRAW!");
        }
        else if (computerChoice[userChoice-1]=="PAPER" && computerChoice[randomNumber]=="PAPER") {
            System.out.println("\nDRAW!");
        }
        else if (computerChoice[userChoice-1]=="SCISSORS" && computerChoice[randomNumber]=="SCISSORS") {
            System.out.println("\nDRAW!");
        }
        else {
            System.out.println("\nYOU LOSS!");
        }

    }
}