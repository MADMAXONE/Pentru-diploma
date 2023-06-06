package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        String filePath = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt";

        try {
            Map<String, String> phonebook = readPhonebook(filePath);
            findAndPrintPhoneNumber(phonebook, "Abbey");
            findAndPrintPhoneNumber(phonebook, "Abdul");
        } catch (IOException e) {
            System.out.println("Error reading the phonebook file: " + e.getMessage());
        }
    }

    private static Map<String, String> readPhonebook(String filePath) throws IOException {
        Map<String, String> phonebook = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    phonebook.put(name, phoneNumber);
                }
            }
        }

        return phonebook;
    }

    private static void findAndPrintPhoneNumber(Map<String, String> phonebook, String name) {
        String phoneNumber = phonebook.get(name);
        if (phoneNumber != null) {
            System.out.print(phoneNumber + " ");
        }
    }
}
