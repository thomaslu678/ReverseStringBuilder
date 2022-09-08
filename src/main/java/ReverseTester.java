package main.java;
import java.util.*;

public class ReverseTester {

    public String reverse(String testStringInput) {
        // This is your test string
        StringBuilder testString = new StringBuilder(testStringInput);

        // This is the reversed version of your test string
        StringBuilder reversedTestString = testString.reverse();

        // Return the reversed string
        return reversedTestString.toString();
    }

    public static void main(String[] args) {

        // Create a way to take in user input
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.println("Enter a string: ");
        String userInputString= sc.nextLine();              //reads string


        // Input validation
        if (userInputString.isEmpty()) {
            System.out.println("Please try again.");
        }



        System.out.println("You have entered: "+userInputString);

        ReverseTester myReverseTester = new ReverseTester();
        System.out.println("This is the reversed string: " + myReverseTester.reverse(userInputString));
    }


}