/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author ssingh
 */
import java.util.Scanner;
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validMoveA = false;
        boolean validMoveB = false;
        String playMore = "";
        String result = "";
        String playerA ="";
        String playerB = "";
        
        do{
        System.out.println("PlayerA enter your move(R P or S)!");
        playerA = scan.nextLine();
        if(playerA.equalsIgnoreCase("R")|| playerA.equalsIgnoreCase("P")|| playerA.equalsIgnoreCase("S"))  {
        validMoveA = true;
        }       
        while(!validMoveA){
            System.out.println("PlayerA enter your move(R P or S)!");
            playerA = scan.nextLine();
            if(playerA.equalsIgnoreCase("R")|| playerA.equalsIgnoreCase("P")|| playerA.equalsIgnoreCase("S"))  {
            validMoveA = true;
        }  
        }
        System.out.println("PlayerB enter your move(R P or S)!");
        playerB = scan.nextLine();
        if(playerB.equalsIgnoreCase("R")|| playerB.equalsIgnoreCase("P")|| playerB.equalsIgnoreCase("S"))  {
        validMoveB = true;
        }       
        while(!validMoveB){
            System.out.println("PlayerB enter your move(R P or S)!");
            playerB = scan.nextLine();
            if(playerB.equalsIgnoreCase("R")|| playerB.equalsIgnoreCase("P")|| playerB.equalsIgnoreCase("S"))  {
            validMoveB = true;
        }  
        }
            if   (playerA.equalsIgnoreCase(playerB))
                        result = "Its a tie!!";
            else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
              		result = "Rock Breaks Scissors Player A wins"; 
            else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
             		result = "Papers Beats Rock Player B wins";
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
           		result = "Papers Beats Rock Player A wins";
	    else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S"))
           		result = "Scissors Cuts Paper Player B wins"; 
            else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
           		result = "Rock Breaks Scissors Player B wins";
	    else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
           		result = "Scissors Cuts Paper Player A wins";                  
            else 
			result = "Invalid input";
            System.out.println(result);
   System.out.println("Do you want to play again? (Enter Y or N)");
             playMore = scan.nextLine();

        }while(playMore.equalsIgnoreCase("Y"));
    }
    
}
