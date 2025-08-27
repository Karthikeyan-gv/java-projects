import java.lang.*;
import java.util.*;

public class Rockpaperscissors {
    public static void main(String[] args) {

        int userChoice=0,i=0,result=0;

        System.out.println("WELCOME TO GAME");
        System.out.println("--------------------");
        System.out.println("1.ROCK\n2.PAPER\n3.SCISSORS");
        
        Scanner input = new Scanner(System.in);

        while(i<3){

            System.out.print("\nENTER YOUR CHOICE(1/2/3): ");
            
            try{
            userChoice=input.nextInt();
            Game obj=new Game();
            result+=obj.game(userChoice);
            // System.out.println("hk"+obj.game(userChoice));
            }
            catch (InputMismatchException e) {
                System.out.print("\nENTER VALID INPUT!");
                input.next();
            }
            i++;

        }

        if (result==2 || result==3) {
            System.out.println("\nGAME ENDED!");
            System.out.println("--------------------");
            System.out.println("FINAL SCORE: YOU WON!");
        }
        else{
            System.out.println("\nGAME ENDED!");
            System.out.println("--------------------");
            System.out.println("FINAL SCORE: YOU LOSS!");
        }
        
        
    }
}

 class Game {

        public int game(int userChoice){
        
        int randomNumber,result=0;

        String[] computerChoice={"ROCK","PAPER","SCISSORS"};

        randomNumber=(int)Math.floor(Math.random()*3);

        try {

        System.out.printf("\nYOUR CHOICE IS %s",computerChoice[userChoice-1]);
        System.out.printf("\nMY CHOICE IS %s",computerChoice[randomNumber]);

        System.out.print("\n--------------------");
            if (computerChoice[userChoice-1]=="ROCK" && computerChoice[randomNumber]=="SCISSORS") {
                System.out.println("\nYOU WIN!");
                result+=1;
            }
            else if (computerChoice[userChoice-1]=="SCISSORS" && computerChoice[randomNumber]=="PAPER") {
                System.out.println("\nYOU WIN!");
                result+=1;
            }
            else if (computerChoice[userChoice-1]=="PAPER" && computerChoice[randomNumber]=="ROCK") {
                System.out.println("\nYOU WIN!");
                result+=1;
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

        } catch (Exception e) {
            System.out.println("\n--------------------");
            System.out.println("CHOICE NOT FOUND!");
        }

        return result;

    }
    
}
