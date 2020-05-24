package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorUsualNameMale implements IGeneratorName {

    @NonNull
    private static final GeneratorUsualNameMale INSTANCE = new GeneratorUsualNameMale();

    @NonNull
    public static GeneratorUsualNameMale getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualNameMale() {
    }

    @NonNull
    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameMale.getInstance().generate();
        final String lastName = GeneratorLastNameMale.getInstance().generate();
        return lastName + " " + firstName;
    }

}
