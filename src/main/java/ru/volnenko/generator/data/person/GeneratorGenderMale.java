package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.api.IGeneratorPerson;

public final class GeneratorGenderMale implements IGeneratorGender {

    @Override
    public IGeneratorPerson person() {
        return GeneratorPersonMale.getInstance();
    }

    @Override
    public IGeneratorName firstName() {
        return GeneratorFirstNameMale.getInstance();
    }

    @Override
    public IGeneratorName lastName() {
        return GeneratorLastNameMale.getInstance();
    }
}
