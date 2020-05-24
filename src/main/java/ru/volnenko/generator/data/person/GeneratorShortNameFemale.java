package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorShortNameFemale implements IGeneratorName {

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
