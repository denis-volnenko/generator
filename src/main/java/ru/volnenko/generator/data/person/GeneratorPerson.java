package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.model.Person;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorPerson implements IGeneratorPerson {

    private static final GeneratorPerson INSTANCE = new GeneratorPerson();

    private static final IGeneratorPerson[] GENERATORS = new IGeneratorPerson[] {
            GeneratorPersonFemale.getInstance(), GeneratorPersonMale.getInstance(),
    };

    public static GeneratorPerson getInstance() {
        return INSTANCE;
    }

    @Override
    public Person generate() {
        return RandomUtil.random(GENERATORS).generate();
    }

}
