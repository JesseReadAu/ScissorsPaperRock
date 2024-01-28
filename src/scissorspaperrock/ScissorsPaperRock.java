/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scissorspaperrock;

import java.util.Scanner;
import java.util.Random;

public class ScissorsPaperRock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int playerChoice;
        int computerChoice;

        //INPUT
        System.out.println("Choose one of the following options:\n0. Scissors\n1. Paper\n2. Rock");
        
        computerChoice = rand.nextInt(3);
        playerChoice = scan.nextInt();
        
        //PROCESS
        if(computerChoice == playerChoice)
        {
            System.out.println("Both players have tied!");
        }
        
        if((playerChoice + 1) % 3 == computerChoice)
        {
            System.out.println("Player has won!");
        }
        
        if((computerChoice + 1) % 3 == playerChoice)
        {
            System.out.println("Computer has won!");
        }
        
        
        //OUTPUT
        /*
        System.out.println("*** Debug ***");
        System.out.println("Player Selected: " + playerChoice + " - Computer selected: " + computerChoice);
        */
        
    }
    
}
