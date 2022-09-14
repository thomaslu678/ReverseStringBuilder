package main.java;
import java.util.*;

public class ReverseTester {

    public String reverse(String testStringInput) {
        // Creates a test string
        StringBuilder testString = new StringBuilder(testStringInput);

        // This is the reversed version of your test string
        StringBuilder reversedTestString = testString.reverse();

        // Return the reversed string
        return reversedTestString.toString();
    }

    public static void main(String[] args) {

        // Creates a way to take in user input
        Scanner sc= new Scanner(System.in);

        // Asks for user to input a string
        System.out.println("Enter a string: ");

        // Reads the string, creating a userInputString object
        String userInputString = sc.nextLine();


        // Input validation to test if String is empty
        boolean invalidInput = true;
        while (invalidInput) {

            // If the user input string is empty or blank, prompt to enter a valid string
            if (userInputString.isEmpty() || userInputString.isBlank()) {
                System.out.println("Please enter a non-empty string: ");
                userInputString = sc.nextLine();
            }
            // If the string is valid (i.e. not empty or blank), end the validation loop and move on
            else{
                invalidInput = false;
            }
        }

        // Print the user's string
        System.out.println("You have entered: " + userInputString);

        // Create the reverse tester
        ReverseTester myReverseTester = new ReverseTester();

        // Print the reverse of the user's string
        System.out.println("This is the reversed string: " + myReverseTester.reverse(userInputString));

    }


}