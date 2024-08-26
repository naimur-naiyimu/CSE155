/*
 * 
 2. Write a Java program that displays the 2 rightmost digits of your student ID in reverse order.
For example, if your student id is 23221454, you need to print 4, and then 5.
[Hint: Use the logic you used in one of the tasks in lab 1]

Output:
4
5
 */
import java.util.Scanner;

public class Evaluation2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student ID: ");
        int studentID = scanner.nextInt();

        // Get the rightmost two digits
        int lastDigit = studentID % 10;          // Extract the last digit
        int secondLastDigit = (studentID / 10) % 10;  // Extract the second last digit

        // Print the digits 
        System.out.println(lastDigit);
        System.out.println(secondLastDigit);
    }
}
