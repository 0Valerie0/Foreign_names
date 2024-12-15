package org.example;

/**
 * This class represents a division
 */
public class Division {
    private int id;
    private String name;

    /**
     * Constructor for a Division
     *
     * @param id   the unique identifier for the division
     * @param name the name of the division
     */
    public Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the ID of the division.
     *
     * @return the ID of the division
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the division.
     *
     * @return the name of the division
     */
    public String getName() {
        return name;
    }
}