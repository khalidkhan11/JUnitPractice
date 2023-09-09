package org.example;

import java.util.ArrayList;

public class CRUDExample {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        // Create
        createPerson(list, "Alice", 30);
        createPerson(list, "Bob", 40);
        createPerson(list, "Charlie", 50);

        // Read
        readAllPersons(list);

        // Update
        updatePerson(list, 1, "Bob Jr.", 41);

        // Read again to see the update
        readAllPersons(list);

        // Delete
        deletePerson(list, 1);

        // Read again to see the deletion
        readAllPersons(list);
    }

    // Create operation: Adds a new Person to the list
    public static void createPerson(ArrayList<Person> list, String name, int age) {
        list.add(new Person(name, age));
    }

    // Read operation: Reads all Persons from the list
    public static void readAllPersons(ArrayList<Person> list) {
        System.out.println("Reading all persons in list:");
        for (Person person : list) {
            System.out.println(person);
        }
    }

    // Update operation: Updates an existing Person in the list by index
    public static void updatePerson(ArrayList<Person> list, int index, String newName, int newAge) {
        if (index >= 0 && index < list.size()) {
            list.set(index, new Person(newName, newAge));
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Delete operation: Removes an existing Person from the list by index
    public static void deletePerson(ArrayList<Person> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
