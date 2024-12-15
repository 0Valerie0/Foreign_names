package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParserBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.FileNotFoundException;

/**
 * A class responsible for reading person data from a CSV file.
 */
public class ReaderCSV {

    /**
     * Reads person data from a CSV file and returns a list of Person objects.
     *
     * @param csvFilePath the path to the CSV file
     * @param separator   the character used to separate values in the CSV file
     * @return a list of Person objects populated from the CSV file
     * @throws Exception if an error occurs while reading the file
     */
    public List<Person> readPeopleFromCsv(String csvFilePath, char separator) throws Exception {
        List<Person> people = new ArrayList<>();
        int divisionId = 1;

        InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);

        if (in == null) {
            throw new FileNotFoundException("File not found: " + csvFilePath);
        }

        try (InputStreamReader reader = new InputStreamReader(in)) {
            CSVReader readerCSV = new CSVReaderBuilder(reader)
                    .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                    .build();

            String[] nextLine;

            readerCSV.readNext(); // Skip the header line

            while ((nextLine = readerCSV.readNext()) != null) {
                try {
                    // Проверка на корректность personId
                    if (nextLine[0] == null || nextLine[0].trim().isEmpty()) {
                        System.err.println("Ошибка: personId не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    int personId = Integer.parseInt(nextLine[0]);

                    // Проверка на корректность name
                    if (nextLine[1] == null || nextLine[1].trim().isEmpty()) {
                        System.err.println("Ошибка: name не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    String name = nextLine[1];

                    // Проверка на корректность gender
                    if (nextLine[2] == null || nextLine[2].trim().isEmpty()) {
                        System.err.println("Ошибка: gender не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    String gender = nextLine[2];

                    // Проверка на корректность birthDate
                    if (nextLine[3] == null || nextLine[3].trim().isEmpty()) {
                        System.err.println("Ошибка: birthDate не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    String birthDate = nextLine[3];

                    // Проверка на корректность categoryCode
                    if (nextLine[4] == null || nextLine[4].trim().isEmpty()) {
                        System.err.println("Ошибка: categoryCode не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    String categoryCode = nextLine[4];

                    // Проверка на корректность salary
                    if (nextLine[5] == null || nextLine[5].trim().isEmpty()) {
                        System.err.println("Ошибка: salary не может быть пустым или null");
                        System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                        continue;
                    }
                    double salary = Double.parseDouble(nextLine[5]);

                    Division division = new Division(divisionId++, categoryCode);
                    Person person = new Person(personId, name, gender, division, salary, birthDate);
                    people.add(person);
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка при парсинге данных: " + e.getMessage());
                    System.err.println("Проблемная строка: " + Arrays.toString(nextLine));
                }
            }
        }

        return people;
    }
}
