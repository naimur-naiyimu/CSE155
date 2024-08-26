/*
1. Write a Java code where given an integer we need to print the last 2 digits of that number.
 */
import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int lastDigit = number % 10;          // Extract the last digit
        int secondLastDigit = (number / 10) % 10;

        // Print the digits 
        System.out.println(lastDigit);
        System.out.println(secondLastDigit);
    }
}
