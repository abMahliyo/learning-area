package lesson_02;

import java.util.Scanner;

public class Solution {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your favourite number: ");

        /*
        * userInput.hasNextDouble() return true if the next value entered is a double
        * hasNextInt() -  Integer input
        * hasNextFloat() - Float input
        * there are others for Boolean, Byte, Long, and Short
         */

        if(userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();
            /*
            * userInput.nextInt() - integer
            * userInput.nextDouble() - double
            * userInput.nextFloat() - float
            * userInput.nextLine() - string
             */

            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

            double numEnteredDivide2 = (double) numberEntered / 2;
            System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);

            int numEnteredRemainder = numberEntered  % 2;
            System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);

            // shorthand way to add to 2 to a variable and assign the result to self
            numberEntered += 2;
            numberEntered -= 2;

            // shorthand way to add 1 to variable
            numberEntered ++;

            // shorthand way to subtract 1 from a variable
            numberEntered--;

            int numEnteredABS = Math.abs(numberEntered);

            int whichIsBigger = Math.max(5, 7);

            int whichIsSmaller= Math.min(5, 7);

            double numSqrt = Math.sqrt(5.23);

            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("Ceiling: " + numCeiling);

            int numFloor = (int) Math.floor(5.23);
            System.out.println("Rounded: " + numFloor);

            int numRound = (int) Math.round(5.23);
            System.out.println("Rounded: " + numRound);

            int randomNumber = (int) (Math.random() * 10);
            System.out.println("A random number " + randomNumber);

        } else {
            System.out.println("Sorry you must enter an integer");
        }
    }
}
