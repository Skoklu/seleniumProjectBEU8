package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some spesific page.
 */

public class BrowserUtils {

    /*
    This method will accept int (in second) and execute Thread.sleep
    for given duration
     */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
}
