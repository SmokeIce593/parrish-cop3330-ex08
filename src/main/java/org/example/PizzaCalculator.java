/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

public class PizzaCalculator {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "How many people?" );
        int people = input.nextInt();

        System.out.print( "How many pizzas do you have?" );
        int pizzatotal = input.nextInt();

        System.out.print( "How many slices per pizza?" );
        int pizzaslices = input.nextInt();

        int totalslices = pizzaslices * pizzatotal;

        System.out.printf( "%d people with %d pizzas (%d slices)", people, pizzatotal, totalslices);
        System.out.printf( "\nEach person gets %d pieces of pizza", totalslices / people);
        System.out.printf( "\nThere are %d leftover pieces", totalslices % people);



    }
}