package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.api.IGeneratorPerson;

public final class GeneratorGenderFemale implements IGeneratorGender {

    @Override
    public IGeneratorPerson person() {
        return GeneratorPersonFemale.getInstance();
    }

    @Override
    public IGeneratorName firstName() {
        return GeneratorFirstNameFemale.getInstance();
    }

    @Override
    public IGeneratorName lastName() {
        return GeneratorLastNameFemale.getInstance();
    }

}
