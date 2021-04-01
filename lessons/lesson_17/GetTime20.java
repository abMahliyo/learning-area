package lesson_17;

// By using threads you can execute multiple blocks
// of code at the same time.This program will output
// the current time and then at a specific time execute
// other code without stopping the time output

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

// By extending the Thread class you can run your code
// concurrently with other threads
public class GetTime20 extends Thread {

    // All of the code the thread executes must be
    // in the run method, or be in a method called for
    // from inside of the run method
    public void run() {

        // Creating fields that will contain date info
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        DateFormat dateFormatter;
        String timeOutput;
        String dateOutput;

        for(int i = 1; i <= 20; i++)
        {
            // A Date object contains date and time data
            rightNow = new Date();

            // Locale defines time formats depending on location
            currentLocale = new Locale("en", "US");

            // DateFormat allows you to define dates/times using predefined
            // styles DEFAULT, SHORT, MEDIUM, LONG, or FULL
            // getTimeInstance only outputs time information
            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);

            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

            // Convert the time and data into Strings
            timeOutput = timeFormatter.format(rightNow);
            dateOutput = dateFormatter.format(rightNow);

            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            // You must wrap the sleep method in error handling
            // code to catch the InterruptedException exception
            // sleep pauses thread execution for 2 seconds below

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }


        }

    }
}
