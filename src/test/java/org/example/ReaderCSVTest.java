package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReaderCSVTest {

    @Test
    public void testReadPersonsFromCsv() throws Exception {
        // Get the path to the CSV file in the resources folder
        String csvFilePath = "foreign_names.csv";

        // Create an instance of ReaderCSV
        ReaderCSV readerCSV = new ReaderCSV();

        // Read persons from the CSV file
        List<Person> people = readerCSV.readPeopleFromCsv(csvFilePath, ',');

        // Verify the results
        assertEquals(2, people.size(), "There should be 2 people");

        Person person1 = people.get(0);
        assertEquals(1, person1.getId(), "ID should be 1");
        assertEquals("John Doe", person1.getName(), "Name should be John Doe");
        assertEquals("M", person1.getGender(), "Gender should be M");
        assertEquals("1980-01-01", person1.getBirthDate(), "BirthDate should be 1980-01-01");
        assertEquals("HR", person1.getDivision().getName(), "CategoryCode should be HR");
        assertEquals(50000, person1.getSalary(), "Salary should be 50000");

        Person person2 = people.get(1);
        assertEquals(2, person2.getId(), "ID should be 2");
        assertEquals("Jane Smith", person2.getName(), "Name should be Jane Smith");
        assertEquals("F", person2.getGender(), "Gender should be F");
        assertEquals("1990-02-02", person2.getBirthDate(), "BirthDate should be 1990-02-02");
        assertEquals("IT", person2.getDivision().getName(), "CategoryCode should be IT");
        assertEquals(60000, person2.getSalary(), "Salary should be 60000");
    }
}
