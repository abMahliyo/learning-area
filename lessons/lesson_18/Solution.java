package lesson_18;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Solution {

    public static void main(String[] args) {
        addThreadsToPool();
    }

    public static  void addThreadsToPool() {

        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

        // Adds a Thread to the pool. Tells that the thread to start executing
        // after 0 seconds and then execute every 2 seconds
        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, SECONDS);

        // Thread.activeCount returns the number of threads running
        System.out.println("Number of Threads: " + Thread.activeCount());

        // Create an array of threads with enough spaces for all active threads
        Thread[] listOfThreads = new Thread[Thread.activeCount()];

        // enumerate fills the Thread array with all active threads
        Thread.enumerate(listOfThreads);

        // Cycle through all the active threads and print out their names
        for(Thread i : listOfThreads)
        {
            System.out.println(i.getName());
        }

        // Get priority of all the threads. Priority is equal to the thread
        // the created the new thread. Top priority is 10, lowest priority is 1
        for(Thread i : listOfThreads)
        {
            System.out.println(i.getPriority());
        }

        // threadName.setPriority can be used to set the priority
        // This allows the above threads to run for approximately 20 seconds
        try {
            Thread.sleep(20000);
        }
        catch (InterruptedException e) {

        }

        // shuts down all the threads in the pool
        // eventPool.shutdown();




    }
}
