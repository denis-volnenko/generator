package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorUsualNameFemale implements IGeneratorName {

    @NonNull
    private static final GeneratorUsualNameFemale INSTANCE = new GeneratorUsualNameFemale();

    @NonNull
    public static GeneratorUsualNameFemale getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualNameFemale() {
    }

    @NonNull
    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameFemale.getInstance().generate();
        final String lastName = GeneratorLastNameFemale.getInstance().generate();
        return lastName + " " + firstName;
    }

}
