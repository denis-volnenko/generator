package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorGender;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.api.IGeneratorPerson;

public final class GeneratorGenderMale implements IGeneratorGender {

    @NonNull
    private static final GeneratorGenderMale INSTANCE = new GeneratorGenderMale();

    @NonNull
    public static GeneratorGenderMale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public IGeneratorPerson person() {
        return GeneratorPersonMale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName firstName() {
        return GeneratorFirstNameMale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName lastName() {
        return GeneratorLastNameMale.getInstance();
    }

    @NonNull
    @Override
    public IGeneratorName middleName() {
        return GeneratorMiddleNameMale.getInstance();
    }

}
