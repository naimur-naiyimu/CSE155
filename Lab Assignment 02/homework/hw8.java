/*
 * 
 * Assume a Hexagon where each of the sides are of the same
length. From the visualization, we can see the values of a and b
are given. Your task is to (a) draw a flowchart and (b) write a
Java code to find the area and the circumference of the Hexagon.
 */

public class hw8{
    public static void main(String[] agrs){
        int a = 3, b = 8;
        //calculate triangle area
        float triangleArea = (0.5f * a *b);
        // calculate rectangular area
        float rectangularArea = a * b;
        // hexagon area is sum of 2 time triangle area and rectangular area
        float hexagonArea =  (2 * triangleArea) + rectangularArea;

        //print final area
        System.out.printf("Hexagon Area is: %.4f%n", hexagonArea );
    }
}