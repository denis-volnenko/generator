package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorPerson;
import ru.volnenko.generator.model.Person;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorPerson implements IGeneratorPerson {

    @NonNull
    private static final GeneratorPerson INSTANCE = new GeneratorPerson();

    @NonNull
    private static final IGeneratorPerson[] GENERATORS = new IGeneratorPerson[] {
            GeneratorPersonFemale.getInstance(), GeneratorPersonMale.getInstance(),
    };

    @NonNull
    public static GeneratorPerson getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public Person generate() {
        return RandomUtil.random(GENERATORS).generate();
    }

}
