package ru.volnenko.generator;

import lombok.NonNull;
import ru.volnenko.generator.data.person.*;
import ru.volnenko.generator.model.Person;

import java.util.Date;
import java.util.UUID;

public final class Generator {

    private Generator() {
    }

    /**
     * Генерация UUID
     * @return
     */
    @NonNull
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Генерация Timestamp
     * @return
     */
    @NonNull
    public static Long timestamp() {
        return System.currentTimeMillis();
    }

    /**
     * Генерация текущей даты
     * @return
     */
    @NonNull
    public static Date now() {
        return new Date();
    }

    /**
     * Генерация случайного имени
     * @return
     */
    @NonNull
    public static String firstName() {
        return GeneratorFirstName.getInstance().generate();
    }

    /**
     * Генерация случайного мужского имени
     * @return
     */
    @NonNull
    public static String firstNameMale() {
        return GeneratorFirstNameMale.getInstance().generate();
    }

    /**
     * Генерация случаного женского имени
     * @return
     */
    @NonNull
    public static String firstNameFemale() {
        return GeneratorFirstNameFemale.getInstance().generate();
    }

    /**
     * Генерация случайной фамилии
     * @return
     */
    @NonNull
    public static String lastName() {
        return GeneratorLastName.getInstance().generate();
    }

    /**
     * Генерация случайной мужской фамилии
     * @return
     */
    @NonNull
    public static String lastNameMale() {
        return GeneratorLastNameMale.getInstance().generate();
    }

    /**
     * Генерация случайной женской фамилии
     * @return
     */
    @NonNull
    public static String lastNameFemale() {
        return GeneratorLastNameFemale.getInstance().generate();
    }

    @NonNull
    public static String shortName() {
        return GeneratorShortName.getInstance().generate();
    }

    @NonNull
    public static String shortNameMale() {
        return GeneratorShortNameMale.getInstance().generate();
    }

    @NonNull
    public static String shortNameFemale() {
        return GeneratorShortNameFemale.getInstance().generate();
    }

    @NonNull
    public static String usualName() {
        return GeneratorUsualName.getInstance().generate();
    }

    @NonNull
    public static String usualNameMale() {
        return GeneratorUsualNameMale.getInstance().generate();
    }

    @NonNull
    public static String usualNameFemale() {
        return GeneratorUsualNameFemale.getInstance().generate();
    }

    /**
     * Генерация случайной карточки
     * @return
     */
    @NonNull
    public static Person person() {
        return GeneratorPerson.getInstance().generate();
    }

    /**
     * Генерация мужской карточки
     * @return
     */
    @NonNull
    public static Person male() {
        return GeneratorPersonMale.getInstance().generate();
    }

    /**
     * Генерация женской карточки
     * @return
     */
    @NonNull
    public static Person female() {
        return GeneratorPersonFemale.getInstance().generate();
    }

}
