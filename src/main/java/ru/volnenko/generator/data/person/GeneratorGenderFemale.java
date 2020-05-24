package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.api.IGeneratorPerson;

public final class GeneratorGenderFemale implements IGeneratorGender {

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

}
