package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.builder.PersonBuilder;
import ru.volnenko.generator.model.Person;

public final class GeneratorPersonMale implements IGeneratorPerson {

    private static final GeneratorPersonMale INSTANCE = new GeneratorPersonMale();

    public static GeneratorPersonMale getInstance() {
        return INSTANCE;
    }

    @Override
    public Person generate() {
        return new PersonBuilder().female()
                .withFirstName(GeneratorFirstNameMale.getInstance().generate())
                .withLastName(GeneratorLastNameMale.getInstance().generate())
                .getPerson();
    }

}
