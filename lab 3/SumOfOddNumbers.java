import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 1;
        int i = 1;

        System.out.println("The odd numbers are: ");
        while (count <= n) {
            System.out.println(i);
            sum += i;
            i += 2;
            count++;
        }

        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
    }
}
