package com.todoapp;

// Class to represent a single to-do item, the blueprint for creating objects
public class ToDo {
    private String description;     // declares a private field called description, and stores type String - text description of the to-do item.

    // Constructor that initializes the ToDo obj with the description argument.
    public ToDo(String description) {
        this.description = description;
    }

    // Getter method to "get" the description of the to-do item
    public String getDescription() {
        return description;
    }
}