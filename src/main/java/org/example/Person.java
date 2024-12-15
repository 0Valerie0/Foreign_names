package org.example;

/**
 * This class represents a person
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private Division division;
    private double salary;
    private String birthDate;

    /**
     * Constructs a Person with the specified attributes.
     *
     * @param id         the unique identifier for the person
     * @param name       the name of the person
     * @param gender     the gender of the person
     * @param division the division the person belongs to
     * @param salary     the salary of the person
     * @param birthDate  the birth date of the person
     */
    public Person(int id, String name, String gender, Division division, double salary, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Returns the ID of the person.
     *
     * @return the ID of the person
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the gender of the person.
     *
     * @return the gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Returns the division of the person.
     *
     * @return the division of the person
     */
    public Division getDivision() {
        return division;
    }

    /**
     * Returns the salary of the person.
     *
     * @return the salary of the person
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Returns the birth date of the person.
     *
     * @return the birth date of the person
     */
    public String getBirthDate() {
        return birthDate;
    }
}
