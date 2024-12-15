package org.example;

import java.util.List;

/**
 * The App class that executes the application.
 */
public class App {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ReaderCSV Reader = new ReaderCSV();
        try {
            List<Person> people = Reader.readPeopleFromCsv("foreign_names.csv", ';');
            for (Person person : people) {
                System.out.println("ID: " + person.getId() + ", Name: " + person.getName() +
                        ", Gender: " + person.getGender() +
                        ", Division: " + person.getDivision().getName() +
                        ", Salary: " + person.getSalary() +
                        ", Birth Date: " + person.getBirthDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}