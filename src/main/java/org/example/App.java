package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "Enter a noun." );
        String Noun = uInput.nextLine();
        System.out.println("Enter a verb.");
        String Verb = uInput.nextLine();
        System.out.println("Enter a adjective");
        String Adjective = uInput.nextLine();
        System.out.println("Enter an adverb");
        String Adverb = uInput.nextLine();
        System.out.println( "Do you " + Verb + " your " + Adjective+" " + Noun + " " + Adverb + "? That's Hilarious!");
    }
}
