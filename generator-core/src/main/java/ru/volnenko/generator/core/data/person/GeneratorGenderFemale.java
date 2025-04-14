package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorGender;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.api.IGeneratorPerson;

public final class GeneratorGenderFemale implements IGeneratorGender {

    @NonNull
    private static final GeneratorGenderFemale INSTANCE = new GeneratorGenderFemale();

    @NonNull
    public static GeneratorGenderFemale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public IGeneratorPerson person() {
        return GeneratorPersonFemale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName firstName() {
        return GeneratorFirstNameFemale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName lastName() {
        return GeneratorLastNameFemale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName middleName() {
        return GeneratorMiddleNameFemale.getInstance();
    }

}
