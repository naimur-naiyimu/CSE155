/*
4. Write a Java program to convert minutes into years and days. For simplicity, assume each
year consists of 365 days.
Test Data:
Given the number of minutes: 3456789

Expected Output:
3456789 minutes is approximately 6 years and 210 days
 */

import java.util.Scanner;

public class lab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given the number of minutes: ");
        int min = scanner.nextInt();

        float y = (float) (min /(60*24*365.00));
        int d = (int)((y%1)*365);
        System.out.println(min + " minutes is approximately " + (int) (y) + " years and " + d +" days");



    }
}
