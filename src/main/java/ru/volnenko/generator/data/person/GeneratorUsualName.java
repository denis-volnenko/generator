package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorUsualName extends AbstractGeneratorName {

    @NonNull
    private static final GeneratorUsualName INSTANCE = new GeneratorUsualName();

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorUsualNameFemale.getInstance(),
            GeneratorUsualNameMale.getInstance()
    };

    @NonNull
    public static GeneratorUsualName getInstance() {
        return INSTANCE;
    }

    @NonNull
    private GeneratorUsualName() {
    }

    @NonNull
    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
