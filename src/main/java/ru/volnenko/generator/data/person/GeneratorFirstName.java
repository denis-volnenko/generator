package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorFirstName extends AbstractGeneratorName {

    private static final GeneratorFirstName INSTANCE = new GeneratorFirstName();

    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorFirstNameMale.getInstance(), GeneratorFirstNameFemale.getInstance()
    };

    public static GeneratorFirstName getInstance() {
        return INSTANCE;
    }

    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorFirstName() {
    }

}
