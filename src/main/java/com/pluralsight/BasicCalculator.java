package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        //create a scanner
        Scanner theScanner = new Scanner(System.in);

        //ask the user for the first number
        System.out.println("Enter the first number: ");

        //store the answer from the user
        int firstNumber = theScanner.nextInt();

        //ask the user for the second number
        System.out.println("Enter the second number: ");

        //store the answer for the second number
        int secondNumber = theScanner.nextInt();
        theScanner.nextLine();

        //we need to ask the user what operation they want to perform
        System.out.println("""
                Possible calculations:
                    (A)dd
                    (S)ubtract
                    (M)ultiply
                    (D)ivide
                Please select an option:
                """);

        //store the answer to what operation
        String operation = theScanner.nextLine();

        //multiply the first and second number and display the result
        int result = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
    }
}
