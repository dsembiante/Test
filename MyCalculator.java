/* Author: Dominic Sembiante
 * This program is designed as a calculator to compute a simple equation. take in two numeric inputs
 * Takes in two numeric inputs of the user's choice and one of four operators shown , then runs an equation on them to get the output.
 */

package myCalculator;

import java.util.*;

public class MyCalculator {
	
	//Calling the getInput method to obtain two numeric values and an operator from the user
	 public static void main(String[] args) {
	        String s1 = getInput("Enter a number: ");
	        String s2 = getInput("Enter a second number: ");
	        String op = getInput("Enter one of the following operations (+ - * /):");

	        //
	        double result = 0;

	        //Try-catch block inserted for catching any exceptions outside of the required prompted values
	        //Switch statement used for calling one of four different methods to perform correct calculation depending on which operator was chosen
	        try {
	            switch (op) {
	                case "+":
	                    result = addValues(s1, s2);
	                    break;
	                case "-":
	                    result = subtractValues(s1, s2);
	                    break;
	                case "*":
	                    result = multiplyValues(s1, s2);
	                    break;
	                case "/":
	                    result = divideValues(s1, s2);
	                    break;
	                default:
	                    System.out.println("Unrecognized operation!");
	                    return;
	            }

	            //Outputs the answer of the equation
	            System.out.println("The answer is " + result);

	            //Catches exception outside of the required prompted values and prints out a formatting exception message
	        } catch (Exception e) {
	            System.out.println("Number formatting exception " + e.getMessage());
	        }
	    }

	 //The four methods below are used for doing the actual computing of the operation
	 //Strings are converted into doubles in order to be computed
	    private static double addValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 + d2;
	    }

	    private static double subtractValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 - d2;
	    }

	    private static double multiplyValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 * d2;
	    }

	    private static double divideValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 / d2;
	    }

	    //Method used for creating a prompt to give user instructions
	    //Creates scanner to take in user input and continues to next prompt
	    private static String getInput(String prompt) {
	        System.out.print(prompt);
	        Scanner myScanner = new Scanner(System.in);
	        return myScanner.nextLine();
	    }
}
