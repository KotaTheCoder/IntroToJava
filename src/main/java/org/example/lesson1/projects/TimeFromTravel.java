package org.example.lesson1.projects;

// John travels a distance of 55 miles at an average speed of 15 mph. Write a program to calculate the total number of
// hours John takes to cover this distance. The program should print the time taken in hours and minutes. Use the
// following formula for calculations. Time = distance/speed


public class TimeFromTravel
{
    public static void main(String[] args) {

        int distance = 55;
        int speed = 15;

        int hours = distance/speed;
        double mins = ((distance % (double)speed)/speed)*60;


        System.out.printf("John traveled %d miles at a speed of %d mph which took %d hours and %.0f minutes.", distance, speed, hours, mins);


    }
}
