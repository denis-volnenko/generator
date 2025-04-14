package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorPerson;
import ru.volnenko.generator.core.builder.PersonBuilder;
import ru.volnenko.generator.core.model.Person;

public final class GeneratorPersonMale implements IGeneratorPerson {

    @NonNull
    private static final GeneratorPersonMale INSTANCE = new GeneratorPersonMale();

    @NonNull
    public static GeneratorPersonMale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public Person generate() {
        return new PersonBuilder().female()
                .withFirstName(GeneratorFirstNameMale.getInstance().generate())
                .withLastName(GeneratorLastNameMale.getInstance().generate())
                .withMiddleName(GeneratorMiddleNameMale.getInstance().generate())
                .getPerson();
    }

}
