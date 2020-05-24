package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.GeneratorName;

public final class GeneratorShortNameFemale implements GeneratorName {

    private static final GeneratorShortNameFemale INSTANCE = new GeneratorShortNameFemale();

    public static GeneratorShortNameFemale getInstance() {
        return INSTANCE;
    }

    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameFemale.getInstance().generate();
        final String lastName = GeneratorLastNameFemale.getInstance().generate();
        return firstName + " " + lastName;
    }

}
