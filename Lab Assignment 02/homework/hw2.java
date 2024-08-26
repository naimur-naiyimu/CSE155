/*
 * 2. Write a Java program that given a number in inches (you have to declare and initialize it
yourself) converts it to meters. Note: One inch is 0.0254 meters.
Test Data:
Given a value for inch: 1000
Expected Output:
1000 inch is 25.4 meters
 */
public  class hw2{
    public static void main(String[] args) {
        int inch = 1000;
        float meters = inch * 0.0254f;
        System.out.println(inch + " inch is " + meters + " meters");


    }
}