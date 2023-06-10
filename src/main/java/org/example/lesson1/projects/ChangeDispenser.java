package org.example.lesson1.projects;
//Write a program that determines the change to be dispensed from a vending
//machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//dollar bill to pay for the item. For example, a possible sample dialogue might be
//the following:
//         Enter price of item
//         (from 25 cents to a dollar, in 5-cent increments):
//        45
//
//
//
//
//
//You bought an item for 45 cents and gave me a dollar,
//so your change is
//2 quarters,
//0 dimes, and
//1 nickels.

import java.util.Scanner;

public class ChangeDispenser {
    public static void main(String[] args) {

        int price;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item. (from 25 cents to a dollar, in 5-cent increments)");
        price = Integer.parseInt(scanner.nextLine());

        System.out.printf("You bought an item for %d.", price);

        int change = 100 - price;
        int quarters = change / 25;
        int dimes = (change % 25) / 10;
        int nickels = (change - ((dimes * 10) + (quarters * 25))) / 5;


        System.out.printf("You bought an item for %d and gave me a dollar,\n" +
                "so your change is\n" +
                "%d quarters,\n" +
                "%d dimes and \n" +
                "%d nickels.", price, quarters, dimes, nickels);

    }
}
