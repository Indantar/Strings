package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {
        /*
        Primitive variables
        -int
        -double
        -short
        -long
        -byte
        -char
        -boolean
        -float
        *******************/

        String myString = "This is a string";
        System.out.println("The string variable contains: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("The string variable contains: " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("The string variable contains: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNum = 120.47;
        lastString = lastString + doubleNum;
        System.out.println("lastString is equal to " + lastString);
    }
}
