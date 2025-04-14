package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorShortNameFemale implements IGeneratorName {

    @NonNull
    private static final GeneratorShortNameFemale INSTANCE = new GeneratorShortNameFemale();

    @NonNull
    public static GeneratorShortNameFemale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameFemale.getInstance().generate();
        final String lastName = GeneratorLastNameFemale.getInstance().generate();
        return firstName + " " + lastName;
    }

}
