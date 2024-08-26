/*
 * 3. Write Java code that calculates and prints the circumference and area of a circle with a radius
of 4 units.
 */
public class hw3 {

    public static void main(String[] args) {
        double radius = 4.0;

        // Define the value of Pi
        double pi = Math.PI;

        // Calculate the circumference using the formula C = 2 * pi * r
        double circumference = 2 * pi * radius;

        // Calculate the area using the formula A = pi * r*r
        double area = pi * Math.pow(radius, 2);

        // Print the results
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }
}
