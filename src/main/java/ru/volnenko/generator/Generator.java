package ru.volnenko.generator;

import ru.volnenko.generator.data.person.*;

import java.util.Date;
import java.util.UUID;

public final class Generator {

    private Generator() {
    }

    /**
     * Генерация UUID
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Генерация Timestamp
     * @return
     */
    public static Long timestamp() {
        return System.currentTimeMillis();
    }

    /**
     * Генерация текущей даты
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * Генерация случайного имени
     * @return
     */
    public static String firstName() {
        return GeneratorFirstName.getInstance().generate();
    }

    /**
     * Генерация случайного мужского имени
     * @return
     */
    public static String firstNameMale() {
        return GeneratorFirstNameMale.getInstance().generate();
    }

    /**
     * Генерация случаного женского имени
     * @return
     */
    public static String firstNameFemale() {
        return GeneratorFirstNameFemale.getInstance().generate();
    }

    /**
     * Генерация случайной фамилии
     * @return
     */
    public static String lastName() {
        return GeneratorLastName.getInstance().generate();
    }

    /**
     * Генерация случайной мужской фамилии
     * @return
     */
    public static String lastNameMale() {
        return GeneratorLastNameMale.getInstance().generate();
    }

    /**
     * Генерация случайной женской фамилии
     * @return
     */
    public static String lastNameFemale() {
        return GeneratorLastNameFemale.getInstance().generate();
    }

    public static String shortName() {
        return GeneratorShortName.getInstance().generate();
    }

    public static String shortNameMale() {
        return GeneratorShortNameMale.getInstance().generate();
    }

    public static String shortNameFemale() {
        return GeneratorShortNameFemale.getInstance().generate();
    }

    public static String usualName() {
        return GeneratorUsualName.getInstance().generate();
    }

    public static String usualNameMale() {
        return GeneratorUsualNameMale.getInstance().generate();
    }

    public static String usualNameFemale() {
        return GeneratorUsualNameFemale.getInstance().generate();
    }

}
