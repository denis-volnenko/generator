package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.builder.PersonBuilder;
import ru.volnenko.generator.model.Person;

public final class GeneratorPersonFemale implements IGeneratorPerson {

    private static final GeneratorPersonFemale INSTANCE = new GeneratorPersonFemale();

    public static GeneratorPersonFemale getInstance() {
        return INSTANCE;
    }

    @Override
    public Person generate() {
        return new PersonBuilder().female()
                .withFirstName(GeneratorFirstNameFemale.getInstance().generate())
                .withLastName(GeneratorLastNameFemale.getInstance().generate())
                .getPerson();
    }

}
