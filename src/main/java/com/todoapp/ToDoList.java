package com.todoapp;

import java.util.ArrayList;

// The ToDoList builds upon the ToDo class, which serves as a container that holds multiple ToDo objects and manages its functionality.
public class ToDoList {
    private ArrayList<ToDo> items;  // declares a private field of an ArrayList which stores objects of ToDo types. Only ToDo obj can be added to the list.

    // Constructor called when a new ToDoList object is created and then initializes the "items" field with an empty ArrayList - Ensures that the new "list" starts with an empty ArrayList.
    public ToDoList() {
        items = new ArrayList<>();
    }

    public ArrayList<ToDo> getItems() {
        return items;
    }

    // Assignment goals: Methods to Add, Delete, and View items in the list.
    // Adds items to the list
    public void addItem(String description) {       // Reminder: void indicates that the method is called to perform an action(s), but does not return any data back to the caller.
        items.add(new ToDo(description));      // the constructor of the ToDo is called with the description as the argument, a new ToDo item is created, that obj is added to the 'items' list.
        System.out.println("Item has been added successfully.");    // Prints out a message to the console that the item has been successfully added.
    }

    // Deletes an item from the list by it's index.
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {   // checks to see if the index provided is in a valid range.
            items.remove(index);                    // removes that item in that given index
            System.out.println("Item has been removed successfully.");
        } else {
            System.out.println("Invalid item index and item has not been removed. Please try again.");
        }
    }

    // Display all items in the list
    public void displayItems() {
        if (items.isEmpty()) {      // Checks if the list is empty first.
            System.out.println("No items found.");
        } else {
            System.out.println("To-Do List: ");
            for (int i = 0; i < items.size(); i++) {        // starts the loop w. i = 0 > ensures the loop continues as long as i is less than the size of the list > then increments i by 1 to move to the next item in the list.
                System.out.println(i + 1 + ". " + items.get(i).getDescription());       // items.get(i) gets the item in that said index then calls the getDescription() to display the String.
            }
        }
    }
}