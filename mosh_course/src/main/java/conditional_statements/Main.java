package conditional_statements;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // COMPARISON
        int x = 1;
        int y = 1;
        System.out.println(x == y); // boolean expression

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hashInCome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hashInCome && hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

        // If
        int temp = 32;
        // All syntax
        if(temp > 30) {
            System.out.println("It's hot today");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("It's cold");
        }
        // Shorter
        if (temp > 30) {
            System.out.println("It's hot today");
            System.out.println("Drink water");
        }
        else if (temp > 20) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("It's cold");
        }

        // Ternary
        int income = 120_000;
        String ticketType = income > 100_000 ? "First class" : "Economy";

        // Switch
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }

        // Fizz Buzz game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if(number % 5 == 0)
            if(number%3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // While
        Scanner scanner2 = new Scanner(System.in);
        String input = "";

        while(!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner2.next().toLowerCase();
            System.out.println(input);
        }
        do{
            System.out.println("Input: ");
            input = scanner2.next().toLowerCase();
            System.out.println(input);
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
        } while (!input.equals("quit"));

        // for each
        String[] fruits = {"Mango", "Apple", "Orange"};
        for(int i = 0;i< fruits.length;i++)
            System.out.println(fruits[i]);
        // or
        for(String fruit : fruits)
            System.out.println(fruit);






    }
}
