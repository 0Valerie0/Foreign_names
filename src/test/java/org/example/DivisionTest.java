package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testConstructorAndGetters() {
        int id = 1;
        String name = "HR";
        Division division = new Division(id, name);

        assertEquals(id, division.getId(), "ID should be the same as the one passed to the constructor");
        assertEquals(name, division.getName(), "Name should be the same as the one passed to the constructor");
    }

    @Test
    public void testGetId() {
        Division division = new Division(2, "Finance");
        assertEquals(2, division.getId(), "ID should be 2");
    }

    @Test
    public void testGetName() {
        Division division = new Division(3, "IT");
        assertEquals("IT", division.getName(), "Name should be 'IT'");
    }

    @Test
    public void testNullName() {
        Division division = new Division(4, null);
        assertNull(division.getName(), "Name should be null");
    }

    @Test
    public void testEmptyName() {
        Division division = new Division(5, "");
        assertEquals("", division.getName(), "Name should be an empty string");
    }
}
