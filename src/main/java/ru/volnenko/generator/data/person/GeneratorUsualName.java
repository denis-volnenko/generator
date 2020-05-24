package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorUsualName extends AbstractGeneratorName {

    private static final GeneratorUsualName INSTANCE = new GeneratorUsualName();

    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorUsualNameFemale.getInstance(),
            GeneratorUsualNameMale.getInstance()
    };

    public static GeneratorUsualName getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualName() {
    }

    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
