package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorUsualNameMale implements IGeneratorName {

    private static final GeneratorUsualNameMale INSTANCE = new GeneratorUsualNameMale();

    public static GeneratorUsualNameMale getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualNameMale() {
    }

    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameMale.getInstance().generate();
        final String lastName = GeneratorLastNameMale.getInstance().generate();
        return lastName + " " + firstName;
    }

}
