package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorShortNameMale implements IGeneratorName {

    private static final GeneratorShortNameMale INSTANCE = new GeneratorShortNameMale();

    public static GeneratorShortNameMale getInstance() {
        return INSTANCE;
    }

    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameMale.getInstance().generate();
        final String lastName = GeneratorLastNameMale.getInstance().generate();
        return firstName + " " + lastName;
    }

}
