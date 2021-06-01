package com.pizzaparty;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String amountOfPeople, amountOfPizza, slicesPerPizza;

        Scanner people = new Scanner(System.in);
        System.out.print("How many people? ");
        amountOfPeople = people.nextLine();
        int newAmountOfPeople = Integer.parseInt(amountOfPeople);

        Scanner pizza = new Scanner(System.in);
        System.out.print("How many pizzas do you have? ");
        amountOfPizza = pizza.nextLine();
        int newAmountOfPizza = Integer.parseInt(amountOfPizza);

        Scanner slicePerPizza = new Scanner(System.in);
        System.out.print("How many slices per pizza? ");
        slicesPerPizza = pizza.nextLine();
        int slices = Integer.parseInt(slicesPerPizza);

        int slice = newAmountOfPizza * slices;
        int leftOver = slices % newAmountOfPizza;

        System.out.print(newAmountOfPeople + " people with " + newAmountOfPizza + " pizzas " + "(" + slice + " slices)");
        System.out.println("");
        System.out.print("The left over is: " + leftOver);

    }
}
