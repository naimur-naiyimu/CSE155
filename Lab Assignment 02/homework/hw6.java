/*
 6. Write the Java code of a program that finds the sum of the first 100 positive numbers. You can
verify your answer by calculating this sum manually.

[Do NOT use loops, use the mathematical formula for calculating sum of arithmetic series given
below].
*/
public class hw6 {

    public static void main(String[] args) {
        int n = 100;
        int sum = n * (n + 1) / 2;

        System.out.println("The sum of the first " + n + " positive numbers is: " + sum);
    }
}
