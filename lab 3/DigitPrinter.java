import java.util.Scanner;

public class DigitPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.print("-");
            number = -number;
        }

        int temp = number;
        int numDigits = 0;
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }
        
        for (int i = numDigits - 1; i >= 0; i--) {
            int divisor = (int) Math.pow(10, i);
            int digit = number / divisor;
            System.out.print(digit);
            if (i > 0) {
                System.out.print(", ");
            }
            number %= divisor;
        }
        
        scanner.close();
    }
}