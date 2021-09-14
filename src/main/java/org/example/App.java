package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Asks user for quote and who said it and prints out a statement of both
        System.out.print("What is the quote? ");
        String inputquote = input.nextLine();

        System.out.print("Who said it? ");
        String inputwho = input.nextLine();
        
        System.out.print(inputwho + " says, " + '"' + inputquote +'"');
    }
}
