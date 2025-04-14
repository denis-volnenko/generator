package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorName;

public final class GeneratorShortNameMale implements IGeneratorName {

    @NonNull
    private static final GeneratorShortNameMale INSTANCE = new GeneratorShortNameMale();

    @NonNull
    public static GeneratorShortNameMale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public String generate() {
        final String firstName = GeneratorFirstNameMale.getInstance().generate();
        final String lastName = GeneratorLastNameMale.getInstance().generate();
        return firstName + " " + lastName;
    }

}
