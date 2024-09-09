import java.util.Scanner;

public class CumulativeSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Number: ");
            int number = scanner.nextInt();

            sum += number;

            System.out.println("Sum = " + sum);
        }
        scanner.close();
    }
}
