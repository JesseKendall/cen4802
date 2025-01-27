package com.todoapp;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {        // The entry point of the program.

        // Local variables that are local to the main method, cannot be accessed by other methods outside of the main method, and are destroyed when the main method exits.
        ToDoList toDoList = new ToDoList();         // Creates an instance of the ToDoList to perform actions
        Scanner scanner = new Scanner(System.in);   // Creates a new Scanner obj. to read input from the console
        boolean running = true;                        // Variable to control the main loop of the program, initialized to true and will continue running unless false.

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Please make a selection: ");

            int selection = scanner.nextInt();      // Reads the user's input and assigns it to the variable selection
            scanner.nextLine();     // Consumes the newline character \n

            // switch(expression) evaluates the given expression, compares it to the case value, executes that block of code, then **break exits the switch statement
            switch (selection) {
                case 1:
                    System.out.println("Enter description of the to-do item: ");
                    String description = scanner.nextLine();    // reads user's input as a string and saves it in the variable description
                    toDoList.addItem(description);
                    break;
                case 2:
                    System.out.println("Enter the item number to remove: ");
                    int itemNumber = scanner.nextInt();
                    toDoList.removeItem(itemNumber - 1);
                    break;
                case 3:
                    toDoList.displayItems();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:        // code block if no cases match.
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}