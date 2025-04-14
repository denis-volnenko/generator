package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorPerson;
import ru.volnenko.generator.core.builder.PersonBuilder;
import ru.volnenko.generator.core.model.Person;

public final class GeneratorPersonFemale implements IGeneratorPerson {

    @NonNull
    private static final GeneratorPersonFemale INSTANCE = new GeneratorPersonFemale();

    @NonNull
    public static GeneratorPersonFemale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public Person generate() {
        return new PersonBuilder().female()
                .withFirstName(GeneratorFirstNameFemale.getInstance().generate())
                .withLastName(GeneratorLastNameFemale.getInstance().generate())
                .withMiddleName(GeneratorMiddleNameFemale.getInstance().generate())
                .getPerson();
    }

}
