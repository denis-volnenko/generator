package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGenerator;
import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.model.Person;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorPerson implements IGenerator<Person> {

    private static final IGeneratorPerson[] GENERATORS = new IGeneratorPerson[] {
            GeneratorPersonFemale.getInstance(), GeneratorPersonMale.getInstance(),
    };

    @Override
    public Person generate() {
        return RandomUtil.random(GENERATORS).generate();
    }

}
