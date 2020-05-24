package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.GeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorLastName extends AbstractGeneratorName {

    private static final GeneratorLastName INSTANCE = new GeneratorLastName();

    private static final GeneratorName[] GENERATORS = new GeneratorName[] {
            GeneratorLastNameMale.getInstance(), GeneratorLastNameFemale.getInstance()
    };

    public static GeneratorLastName getInstance() {
        return INSTANCE;
    }

    @Override
    protected GeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorLastName() {
    }

}
