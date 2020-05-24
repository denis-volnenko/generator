package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorLastName extends AbstractGeneratorName {

    private static final GeneratorLastName INSTANCE = new GeneratorLastName();

    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorLastNameMale.getInstance(), GeneratorLastNameFemale.getInstance()
    };

    public static GeneratorLastName getInstance() {
        return INSTANCE;
    }

    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorLastName() {
    }

}
