/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf ("What is the quote? ");

        String quote = input.nextLine ();//Obtain user input

        System.out.printf ("Who said it? ");

        String person = input.nextLine ();//Obtain user input

        System.out.printf ("%s says, \"%s\"", person, quote);//Display quote with quotation marks

    }//End of method
}//End of class
