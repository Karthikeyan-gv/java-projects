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

        switch (userChoice) {
            case 1:
                System.out.printf("\nYOUR CHOICE IS %s",computerChoice[0]);
                System.out.printf("\nMY CHOICE IS %s",computerChoice[randomNumber]);
                break;
            case 2:
                System.out.printf("\nYOUR CHOICE IS %s",computerChoice[1]);
                System.out.printf("\nMY CHOICE IS %s",computerChoice[randomNumber]);
                break;
            case 3:
                System.out.printf("\nYOUR CHOICE IS %s",computerChoice[2]);
                System.out.printf("\nMY CHOICE IS %s",computerChoice[randomNumber]);
                break;
            default:
                System.out.println("CHOICE NOT FOUND!");
                break;
        }

        // if(computerChoice[userChoice]==computerChoice[randomNumber]){
        //     System.out.println("\nDRAW!");
        // }
        // else if () {
        //     System.out.println("\nYOU WIN!");
        // }
        // else {
        //     System.out.println("\nYOU LOSS!");
        // }

    }
}