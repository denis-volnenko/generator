package ru.volnenko.generator;

import ru.volnenko.generator.data.GeneratorFirstNameFemale;
import ru.volnenko.generator.data.GeneratorFirstNameMale;

import java.util.Date;
import java.util.UUID;

public final class Generator {

    private Generator() {
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static Long timestamp() {
        return System.currentTimeMillis();
    }

    public static Date now() {
        return new Date();
    }

    public static String firstNameMale() {
        return GeneratorFirstNameMale.generate();
    }

    public static String firstNameFemale() {
        return GeneratorFirstNameFemale.generate();
    }

}
