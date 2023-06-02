package org.example.lesson1;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
        double money = 1.75;
        double first = 12.355;
        double second = 83.2266;
        double third = 32.20;
        double fourth = 40;
        System.out.printf("%s %6.2f\n", "$", money);
        //double click CTRL and hold CTRL second time and then press down arrow to write multiple lines at the same time
        System.out.printf("$ %8.2f\n", first);
        System.out.printf("$ %8.2f\n", second);
        System.out.printf("$ %8.2f\n", third);
        System.out.printf("$ %8.2f\n", fourth);


        NumberFormat formmater = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        System.out.println(formmater.format(15.3));

//  Different way to do above
        DecimalFormat customerFormatter = new DecimalFormat("0000.00");

        System.out.println(customerFormatter.format(1000.324));

    }
}
