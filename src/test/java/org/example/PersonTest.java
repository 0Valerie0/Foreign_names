package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorAndGetters() {
        int id = 1;
        String name = "John Doe";
        String gender = "M";
        Division division = new Division(101, "HR");
        double salary = 50000.0;
        String birthDate = "1980-01-01";

        Person person = new Person(id, name, gender, division, salary, birthDate);

        assertEquals(id, person.getId(), "ID should be the same as the one passed to the constructor");
        assertEquals(name, person.getName(), "Name should be the same as the one passed to the constructor");
        assertEquals(gender, person.getGender(), "Gender should be the same as the one passed to the constructor");
        assertEquals(division, person.getDivision(), "Division should be the same as the one passed to the constructor");
        assertEquals(salary, person.getSalary(), "Salary should be the same as the one passed to the constructor");
        assertEquals(birthDate, person.getBirthDate(), "BirthDate should be the same as the one passed to the constructor");
    }

    @Test
    public void testGetId() {
        Person person = new Person(2, "Jane Smith", "F", new Division(102, "IT"), 60000.0, "1990-02-02");
        assertEquals(2, person.getId(), "ID should be 2");
    }

    @Test
    public void testGetName() {
        Person person = new Person(3, "Alice Johnson", "F", new Division(103, "Finance"), 70000.0, "1985-03-03");
        assertEquals("Alice Johnson", person.getName(), "Name should be 'Alice Johnson'");
    }

    @Test
    public void testGetGender() {
        Person person = new Person(4, "Bob Brown", "M", new Division(104, "Marketing"), 55000.0, "1975-04-04");
        assertEquals("M", person.getGender(), "Gender should be 'M'");
    }

    @Test
    public void testGetDivision() {
        Division division = new Division(105, "Sales");
        Person person = new Person(5, "Charlie Green", "M", division, 65000.0, "1995-05-05");
        assertEquals(division, person.getDivision(), "Division should be the same as the one passed to the constructor");
    }

    @Test
    public void testGetSalary() {
        Person person = new Person(6, "Diana White", "F", new Division(106, "HR"), 52000.0, "1982-06-06");
        assertEquals(52000.0, person.getSalary(), "Salary should be 52000.0");
    }

    @Test
    public void testGetBirthDate() {
        Person person = new Person(7, "Eve Black", "F", new Division(107, "IT"), 68000.0, "1992-07-07");
        assertEquals("1992-07-07", person.getBirthDate(), "BirthDate should be '1992-07-07'");
    }

    @Test
    public void testNullValues() {
        Person person = new Person(8, null, null, null, 0.0, null);
        assertEquals(8, person.getId(), "ID should be 8");
        assertNull(person.getName(), "Name should be null");
        assertNull(person.getGender(), "Gender should be null");
        assertNull(person.getDivision(), "Division should be null");
        assertEquals(0.0, person.getSalary(), "Salary should be 0.0");
        assertNull(person.getBirthDate(), "BirthDate should be null");
    }

    @Test
    public void testEmptyStrings() {
        Person person = new Person(9, "", "", new Division(108, ""), 0.0, "");
        assertEquals(9, person.getId(), "ID should be 9");
        assertEquals("", person.getName(), "Name should be an empty string");
        assertEquals("", person.getGender(), "Gender should be an empty string");
        assertEquals(new Division(108, ""), person.getDivision(), "Division should be an empty string");
        assertEquals(0.0, person.getSalary(), "Salary should be 0.0");
        assertEquals("", person.getBirthDate(), "BirthDate should be an empty string");
    }
}
