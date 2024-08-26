/*
 * 
 5. Design a Java program to calculate Sin and Cos values
from a right-angle triangle. Assume the values of a and b are
4.5 and 9.5 respectively. Finally, print the Sin and Cos values
of angle A and angle B (SinA, CosA, SinB, CosB). The
formulas to calculate these values are given below.
Hint: You need the values for all 3 sides to calculate both
sin and cos. You are given only a and b. How would you get
the value of c? You’ll need the help of Math.sqrt().
 */
public class lab5 {

    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;

        // Calculate the hypotenuse c using Pythagorean theorem
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Calculate Sin and Cos for angle A
        double sinA = a / c;
        double cosA = b / c;

        // Calculate Sin and Cos for angle B
        double sinB = b / c;
        double cosB = a / c;

        // Print the values
        System.out.println("SinA: " + sinA);
        System.out.println("CosA: " + cosA);
        System.out.println("SinB: " + sinB);
        System.out.println("CosB: " + cosB);
    }
}
