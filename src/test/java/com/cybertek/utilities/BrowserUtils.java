package com.cybertek.utilities;

public class BrowserUtils {
    //used to store common utility methods

    /*
    Method that will accept int argument
    Wait for a given second duration
     */
    public static void sleep(int second) {

        second *=1000; //to convert second to millisecond

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in the sleep method");
        }
        //tries the code we pass in "try" block and if exception happens does whatever we
        //have in the "catch" block
    }
}
