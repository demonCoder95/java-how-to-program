/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6;

import java.security.SecureRandom;

/**
 *
 * @author noorm
 */
public class Craps {
    // create a new secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    // enum type with constants that represent the game status
    private enum Status { CONTINUE, WON, LOST};
    
    // contants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    // play one game of craps
    public static void main(String[] args) {
        int myPoint = 0;    // points if no win/loss on first roll
        Status gameStatus;
        
        int sumOfDice = rollDice();
        
        // determine the game status and point based on the first roll
        switch(sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        
        // while the game is not complete
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            
            // determine game status
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
        }
        
        // display won or lost message
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }
    // roll dice, calculate sum and display results
    public static int rollDice(){
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    }
}
