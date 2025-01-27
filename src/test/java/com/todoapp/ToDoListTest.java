package com.todoapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class is all about making sure the ToDoList class works as expected.
 * We’re testing how items are added, removed, and how the system handles edge cases like invalid indexes.
 */
public class ToDoListTest {
    private ToDoList toDoList; // The ToDoList instance we’ll use in all the tests.

    /**
     * Sets up a fresh ToDoList before every test.
     * Keeps things clean and ensures tests don't interfere with each other.
     */
    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    /**
     * Tests adding a single item to the list.
     * We’re checking if the size of the list increases correctly.
     */
    @Test
    void testAddItem() {
        toDoList.addItem("Buy groceries");
        assertEquals(1, toDoList.getItems().size(), "The list should have one item after adding 'Buy groceries'.");
    }

    /**
     * Tests adding multiple items to the list.
     * Verifies both the size of the list and the contents to make sure everything was added in the right order.
     */
    @Test
    void testAddMultipleItems() {
        toDoList.addItem("Buy groceries");
        toDoList.addItem("Clean the house");

        // Validate the size of the list
        assertEquals(2, toDoList.getItems().size(), "The list should have two items after adding both tasks.");

        // Validate the content of the list
        assertEquals("Buy groceries", toDoList.getItems().get(0).getDescription(), "The first item should be 'Buy groceries'.");
        assertEquals("Clean the house", toDoList.getItems().get(1).getDescription(), "The second item should be 'Clean the house'.");
    }

    /**
     * Tests removing an item from the list.
     * Ensures the correct item is removed and the remaining items stay intact.
     */
    @Test
    public void testRemoveItem() {
        toDoList.addItem("Buy groceries");
        toDoList.addItem("Clean the house");

        // Remove the first item
        toDoList.removeItem(0);

        // Validate the size and content of the list
        assertEquals(1, toDoList.getItems().size(), "The list should have one item left after removing the first.");
        assertEquals("Clean the house", toDoList.getItems().get(0).getDescription(), "The remaining item should be 'Clean the house'.");
    }

    /**
     * Tests removing an item using an invalid index.
     * We’re making sure that nothing breaks and the list stays unchanged.
     */
    @Test
    public void testRemoveItemInvalidIndex() {
        toDoList.addItem("Buy groceries");

        // Try to remove an item at an invalid index
        toDoList.removeItem(5);

        // Validate that the list remains unchanged
        assertEquals(1, toDoList.getItems().size(), "The list should still have one item because the index was invalid.");
    }
}