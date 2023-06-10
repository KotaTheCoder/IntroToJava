package org.example.lesson1.projects;

import java.util.Locale;
import java.util.Scanner;

public class PigLatinName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First name?");

        String first = keyboard.nextLine();

        System.out.println("Last name?");
        String last = keyboard.nextLine();

        first = first.toLowerCase();
        last = last.toLowerCase();

        int firstSize = first.length();
        int lastSize = last.length();

        //example: Kota ---> Kota.substring(1,4) --> ota

        //Piglatinize
        first = first.substring(1, firstSize) + first.substring(0, 1) + "ay";
        last = last.substring(1, lastSize) + last.substring(0,1) + "ay";

        System.out.println("Your pig latin name is " + first + " " + last);

    }
}
