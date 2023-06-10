package org.example.lesson1.projects;

//Write a program that inputs the name, quantity, and price of three items. The
//name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
//be output to two decimal places. The bill should be formatted in columns with
//30 characters for the name, 10 characters for the quantity, 10 characters for the
//price, and 10 characters for the total. Sample input and output are shown as follows:

//  Input name of item 1:
//  lollipops
//  Input quantity of item 1:
//  10
//  Input price of item 1:
//  0.50

//  Input name of item 2:
//  diet soda
//  Input quantity of item 2:
//  3
//  Input price of item 2:
//  1.25

//  Input name of item 3:
//  chocolate bar
//  Input quantity of item 3:
//  20
//  Input price of item 3:
//  0.75
//  Your bill:

//Item                  Quantity            Price           Total
//lollipops             10                  0.50            5.00
//diet soda             3                   1.25            3.75
//chocolate bar         20                  0.75            15.00

//Subtotal                                                  23.75
//6.25% sales tax                                            1.48
//Total                                                     25.23

import java.util.Scanner;

public class BillOutputter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name of item 1:");
        String name1 = scanner.nextLine();

        System.out.println("Input quantity of item 1:");
        int quantity1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input price of item 1:");
        float price1 = Float.parseFloat(scanner.nextLine());


        System.out.println("Input name of item 2:");
        String name2 = scanner.nextLine();

        System.out.println("Input quantity of item 2:");
        int quantity2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input price of item 2:");
        float price2 = Float.parseFloat(scanner.nextLine());



        System.out.println("Input name of item 3:");
        String name3 = scanner.nextLine();

        System.out.println("Input quantity of item 3:");
        int quantity3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input price of item 3:");
        float price3 = Float.parseFloat(scanner.nextLine());

        float total1 = price1 * quantity1;
        float total2 = price2 * quantity2;
        float total3 = price3 * quantity3;

        float subtotal = total1 + total2 + total3;
        float taxtotal = subtotal * 0.0625f;
        float grandtotal = subtotal + taxtotal;


        System.out.printf("Your bill:\n\n" +
                "Item           Quantity            Price           Total\n" +
                "%s             %d                  %.2f            %.2f\n" +
                "%s             %d                  %.2f            %.2f\n" +
                "%s             %d                  %.2f            %.2f\n\n" +
                "Subtotal                                           %.2f\n" +
                "6.25 percent sales tax                             %.2f\n" +
                "Total                                              %.2f",
                name1, quantity1, price1, total1,
                name2, quantity2, price2, total2,
                name3, quantity3, price3, total3,
                subtotal, taxtotal, grandtotal);
    }
}
