/*
* An exception object is created when error occurs
* It tells you what error occurred
*
* java.lang.RuntimeException : exceptions that can be thrown during the normal
* operation of the JVM. These exceptions are responsibility of a programmer.
*
* java.lang.Exception : exceptions that are checked for by the java compiler
 */

package lesson_06;

/*
* Common Exceptions
* ArithmeticException: An arithmetic operation occurs with no answer
* (Division by Zero)
*
* ClassNotFoundException: A class is called for that doesn't exist
*
* IllegalArgumentException: A method has been passed an illegal argument
*
* IndexOutOfBoundsException: Thrown when an index for an array, string is
* called for, but doesn't exist
*
* InputMismatchException: (Part of NoSuchElementException) User enters the
* wrong data type into a Scanner method
*
* IOException: An I/O operation failed
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    static Scanner userInput  = new Scanner(System.in);

    public static void main(String[] args) {
       divideByZero(2);

       System.out.print("How old are you? ");
       int age = checkValidAge();

       if(age != 0) {
           System.out.println("You are " + age + " years old");
       }
       getAFile("./somestuff.txt");

    }

    public static void divideByZero(int a)
    {
        try
        {
            System.out.println(a/0);
        }
        catch(ArithmeticException e)
        {
            // your custom error message
            System.out.println("You can't divide by zero");

            // Java's error message for this exception
            System.out.println(e.getMessage());

            // Prints the exception name and error message
            System.out.println(e.toString());

            // Prints the standard error stack trace
            e.printStackTrace();
        }
    }

    public static int checkValidAge()
    {
        try
        {
            return userInput.nextInt(); // nextInt() receives the user input
        }
        catch (InputMismatchException e)
        {
            userInput.next(); // skips the last user input and waits for the next
            System.out.print("That isn't a whole number");
            return 0;
        }
    }

    /*
    * If you prefer to throw an exception to calling method you use throw
    * public static void getAFile(String fileName) throws IOException,  FileNotFoundException
    * {
    *     FileInputStream file = new FileInputStream(fileName);
    *  }
    * if main called this method, main would have to handle th exception
    *
    * public static void main(String[] args) {
    *     try {
    *        getAFile("./somestuff.txt");
    *     }
    *     catch(IOException e) {
    *             System.out.println("An unknown IO Error Occurred");
    *     }
     */

    public static void getAFile(String fileName)
    {
        try{
            /* If I tried to do this without providing for an exception
            * I'd get the error Unhandled Exception Type FileNotFoundException
            * A checked exception is an exception the compiler forces you to protect against
             */
            FileInputStream file = new FileInputStream(fileName);
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Sorry I couldn't find that file");
        }

        // You can catch numerous exceptions
        catch(IOException e)
        {
            System.out.println("An unknown IO Error Occurred");
        }

        /* To ignore an exception do this
        * catch (ClassNotFoundException E)
        * {}
         */

        /*
        * Java 7 allows you to catch multiple exceptions at once
        * catch(FileNotFoundException | IOException e)
        * {}
         */

        // This will catch any exception
        catch(Exception e)
        {
            System.out.println("I catch every exception");
        }

        // If used finally is always executed whether there was an exception or not
        // TIt is used for clean up work like closing files amd database
        finally {
            System.out.println("");
        }
    }
}
