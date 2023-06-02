package org.example.lesson1;

public class Strings {
    public static void main(String[] args) {
        String name = "Kota ";
        String statement = "is 27 years old. Fuck.";

        System.out.println(name + statement);
        //printf
        System.out.printf("%s is using string interpolation and %s\n", name, statement);
        System.out.printf("Problem?\n");

        System.out.println(3 == 3);
        System.out.println("Kota".equalsIgnoreCase("kota"));


        String animal = "elephant";
        //.length counts the number of letters in the string
        System.out.println(animal.length());


        StringBuilder sentenceDemo = new StringBuilder();
        sentenceDemo
                .append("This")
                .append(" is a");

        //SOME STUFF HAPPENING

        sentenceDemo.append(" full sentence");

       String sentence = sentenceDemo.toString();

        System.out.println(sentence.indexOf("is"));


    }
}
