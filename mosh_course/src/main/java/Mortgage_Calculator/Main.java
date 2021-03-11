package Mortgage_Calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    // Use example:
    // Principal: ($1K - $1M)
    // Annual interest rate: (0 - 30)
    // Period (Years) : (1 - 30)
    // Mortgage result expected

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal =0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        System.out.println("Calculate your Mortgage");

        // get principal
        while(true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1K and 1M");
        }

        //get monthly interest
        while(true) {
            System.out.println("Annual interest: ");
            annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        // Mortgage formula:
        // P( r(1 + r)^n / ((1 + r)^n) - 1)

        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
