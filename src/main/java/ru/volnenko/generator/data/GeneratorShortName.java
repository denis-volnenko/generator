package ru.volnenko.generator.data;

import ru.volnenko.generator.api.GeneratorName;

public final class GeneratorShortName extends AbstractGeneratorName {

    private static final GeneratorShortName INSTANCE = new GeneratorShortName();

    private static final GeneratorName[] GENERATORS = new GeneratorName[] {
        GeneratorShortNameFemale.getInstance(),
        GeneratorShortNameMale.getInstance()
    };

    private GeneratorShortName() {
    }

    public static GeneratorShortName getInstance() {
        return INSTANCE;
    }

    @Override
    protected GeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
