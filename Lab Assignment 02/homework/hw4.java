/*
 * 4. Write a Java Code to display the multiplication table for a given positive integer 'n'. The table
should include the products of 'n' with each of the numbers from 1 to 10. For example, if n = 5,
your code should output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
[You are not allowed to use loops to solve this problem.]
 */
import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Display the multiplication table for 'n' from 1 to 10 without using loops
        System.out.println(n + " x 1 = " + (n * 1));
        System.out.println(n + " x 2 = " + (n * 2));
        System.out.println(n + " x 3 = " + (n * 3));
        System.out.println(n + " x 4 = " + (n * 4));
        System.out.println(n + " x 5 = " + (n * 5));
        System.out.println(n + " x 6 = " + (n * 6));
        System.out.println(n + " x 7 = " + (n * 7));
        System.out.println(n + " x 8 = " + (n * 8));
        System.out.println(n + " x 9 = " + (n * 9));
        System.out.println(n + " x 10 = " + (n * 10));
    }
}
