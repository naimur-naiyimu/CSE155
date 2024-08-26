/*
 1. Write the Java code for the following:
2.1 Declare an integer variable. Initialize it with some value of your choice and print it to
check the value has been stored properly.
2.2 Declare and initialize another integer variable. Add this to the first one and print out the
result. Verify that the addition has been done correctly.
2.3 Now print the product and division of the two integer numbers.
2.4 Repeat exercises 2.1, 2.2, and 2.3 for variables of data type double. Verify your
answers.
2.5 Repeat exercises 2.1, 2.2, and 2.3 for one double data type and one integer datatype.
Verify your answers.
2.6 Repeat exercises 2.1 and 2.2 for variables of data type String. How does the addition
operator work for Strings? What if the first variable is an integer and the second is a String and
vice versa?
 */
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //int number1 = 500;
        ///int number2 = 600;
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();
        System.out.println("Integer number1 is :" + number1);
        System.out.println("Integer number2 is :" + number2);
        System.out.println("Sum is :" + number1 + number2);
        System.out.println("division is :" + number2 /number1);
        System.out.println("Modules :" + number2%number1);

        System.out.println("Enter a float number: ");
        float number3 = scanner.nextFloat();
        System.out.println("Enter a Double number: ");
        double number4 = scanner.nextDouble();
        System.out.println("Float number is :" + number3);
        System.out.println("Double number is :" + number4);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner1.nextLine();
        char chr = 'N';
        System.out.println("String is :" +name);
        System.out.println("Char is :" + chr);
        System.out.println("Concat  is :" + name + chr);

    }
}