package org.example.lesson1.projects;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number.");
        int dividend = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter a second number to divide by.");
        int divisor = Integer.parseInt(keyboard.nextLine());

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.printf("The dividend is %d and the divisor is %d\n", dividend, divisor);
        System.out.printf("The quotient is %d and the remainder is %d\n", quotient, remainder);


    }
}
