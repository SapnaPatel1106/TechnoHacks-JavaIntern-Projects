package rockpaperscissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            String rps[]={"rock","paper","scissor"};
            String computerMove=rps[new Random().nextInt(rps.length)];
            String playerMove;
            while(true){
                System.out.println("User enter your move(rock,paper,scissor)");
                playerMove=s.next();
                if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor") ){
                    System.out.println("User played: "+playerMove);
                    break;
                }
                System.out.println("Please enter valid move");
            }
             System.out.println("Computer played: "+computerMove);
             if(playerMove.equals(computerMove)){
                  System.out.println("Game is tie");
             }else if(playerMove.equals("rock")){
                 if(computerMove.equals("paper")){
                      System.out.println("You lose");
                 }
                 if(computerMove.equals("scissor")){
                      System.out.println("You Win");
                 }
             }else if(playerMove.equals("paper")){
                 if(computerMove.equals("rock")){
                      System.out.println("You Win");
                 }
                 if(computerMove.equals("scissor")){
                      System.out.println("You lose");
                 }
             }else if(playerMove.equals("scissor")){
                 if(computerMove.equals("paper")){
                      System.out.println("You Win");
                 }
                 if(computerMove.equals("rock")){
                      System.out.println("You lose");
                 }
             }
             System.out.println("You want to play again(yes/no)");
             String choice=s.next();
             if(choice.equals("no")){
                 break;
             }
        }
    }
    
}
