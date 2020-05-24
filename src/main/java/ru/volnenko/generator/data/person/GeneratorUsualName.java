package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.GeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorUsualName extends AbstractGeneratorName {

    private static final GeneratorUsualName INSTANCE = new GeneratorUsualName();

    private static final GeneratorName[] GENERATORS = new GeneratorName[] {
            GeneratorUsualNameFemale.getInstance(),
            GeneratorUsualNameMale.getInstance()
    };

    public static GeneratorUsualName getInstance() {
        return INSTANCE;
    }

    private GeneratorUsualName() {
    }

    @Override
    protected GeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
