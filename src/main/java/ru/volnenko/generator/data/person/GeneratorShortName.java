package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorShortName extends AbstractGeneratorName {

    private static final GeneratorShortName INSTANCE = new GeneratorShortName();

    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
        GeneratorShortNameFemale.getInstance(),
        GeneratorShortNameMale.getInstance()
    };

    private GeneratorShortName() {
    }

    public static GeneratorShortName getInstance() {
        return INSTANCE;
    }

    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
