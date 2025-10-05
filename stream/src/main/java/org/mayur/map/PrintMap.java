package org.mayur.map;

import java.util.Map;

/**
 * Demonstrates different ways to print a Map in Java.
 */
public class PrintMap {

    public static void main(String[] args) {
        // Create a map with 5 employee entries
        Map<String, String> employeeMap = Map.of(
                "E001", "Amit Sharma",
                "E002", "Priya Singh",
                "E003", "Rahul Verma",
                "E004", "Shital Patil",
                "E005", "Vikram Rao"
        );

        // 1. Print using entrySet() with Stream API
        System.out.println("1. Using entrySet() and Stream:");
        employeeMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // 2. Print using keySet() with Stream API
        System.out.println("\n2. Using keySet() and Stream:");
        employeeMap.keySet()
                .stream()
                .forEach(key -> System.out.println(key + ": " + employeeMap.get(key)));

        // 3. Print using forEach method of Map with lambda expression
        System.out.println("\n3. Using Map.forEach with lambda:");
        employeeMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // 4. Print using forEach method of Map with method reference
        System.out.println("\n4. Using Map.forEach with method reference:");
        employeeMap.forEach(PrintMap::printEntry);
    }

    /**
     * Helper method to print a map entry.
     */
    private static void printEntry(String key, String value) {
        System.out.println(key + ": " + value);
    }
}
