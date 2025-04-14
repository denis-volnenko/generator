package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorFullNameMale implements IGeneratorName {

    @NonNull
    private static final GeneratorFullNameMale INSTANCE = new GeneratorFullNameMale();

    @NonNull
    public static GeneratorFullNameMale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public String generate() {
        @NonNull final IGeneratorGender generator = GeneratorGenderMale.getInstance();
        @NonNull final String lastName = generator.lastName().generate();
        @NonNull final String firstName = generator.firstName().generate();
        @NonNull final String middleName = generator.middleName().generate();
        return lastName + " " + firstName + " " + middleName;
    }

}
