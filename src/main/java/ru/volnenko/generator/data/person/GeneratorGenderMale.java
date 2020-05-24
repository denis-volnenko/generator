package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.api.IGeneratorPerson;

public final class GeneratorGenderMale implements IGeneratorGender {

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
}
