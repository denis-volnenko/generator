package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.builder.PersonBuilder;
import ru.volnenko.generator.model.Person;

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
