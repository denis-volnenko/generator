package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.GeneratorName;

public final class GeneratorUsualNameFemale implements GeneratorName {

    private static final GeneratorUsualNameFemale INSTANCE = new GeneratorUsualNameFemale();

    public static GeneratorUsualNameFemale getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualNameFemale() {
    }

    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameFemale.getInstance().generate();
        final String lastName = GeneratorLastNameFemale.getInstance().generate();
        return lastName + " " + firstName;
    }

}
