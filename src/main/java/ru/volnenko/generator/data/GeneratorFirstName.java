package ru.volnenko.generator.data;

import ru.volnenko.generator.api.GeneratorName;
import ru.volnenko.generator.api.IGenerator;

public final class GeneratorFirstName extends AbstractGeneratorName {

    private static final GeneratorFirstName INSTANCE = new GeneratorFirstName();

    private static final GeneratorName[] GENERATORS = new GeneratorName[] {
            GeneratorFirstNameMale.getInstance(), GeneratorFirstNameFemale.getInstance()
    };

    public static GeneratorFirstName getInstance() {
        return INSTANCE;
    }

    protected GeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorFirstName() {
    }

}
