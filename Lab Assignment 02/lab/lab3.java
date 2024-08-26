/*
3. Write a Java program declaring two integer variables and initializing them. Your task is to
swap the values of these two variables. You must complete it using two different approaches.
● By Creating a third variable.
● Without creating any other variables.
 */
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();

        //after swap
        System.out.println("using temp variable\n\n");
        System.out.println("Before swap \nnumber1 is: " + number1 + "\nnumber2 is: " + number2);
        // using extra variable 
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("\nAfter swap \nnumber1 is: " + number1 + "\nnumber2 is: " + number2);

        System.out.println("\n\nwithout using temp variable\n");

        System.out.println("Before swap \nnumber1 is: " + number1 + "\nnumber2 is: " + number2);
        // without using extra variable 
        number1 = number2 + number1;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("\nAfter swap \nnumber1 is: " + number1 + "\nnumber2 is: " + number2);

    }
}
