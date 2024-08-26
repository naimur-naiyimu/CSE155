/*
7. You have been traveling on a bike for 5 hours, 56 minutes, and 23 seconds. Assuming the
distance covered is (Last 4 digits of your student ID) meter. Write a Java code to display the
velocity of your bike in kilometers per hour and miles per hour. [Hint: 1 mile = 1609 meters]
Test Data:
Input distance in meters: 2500 // Assuming the last 4 digits are 2500
Expected Output:
Your velocity in km/h is 0.4208951
Your velocity in miles/h is 0.2615880
*/

public class hw7 {

    public static void main(String[] args) {
        // Test data
        int distanceInMeters = 1002; 
        int hours = 5;
        int minutes = 56;
        int seconds = 23;

        // Convert time to total hours
        double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Convert distance to kilometers
        double distanceInKilometers = distanceInMeters / 1000.0;

        // Calculate velocity in km/h
        double velocityKmPerHour = distanceInKilometers / totalHours;

        // Convert distance to miles
        double distanceInMiles = distanceInMeters / 1609.0;

        // Calculate velocity in miles/h
        double velocityMilesPerHour = distanceInMiles / totalHours;

        // Print 
        System.out.printf("Your velocity in km/h is %.7f%n", velocityKmPerHour);
        System.out.printf("Your velocity in miles/h is %.7f%n", velocityMilesPerHour);
    }
}
