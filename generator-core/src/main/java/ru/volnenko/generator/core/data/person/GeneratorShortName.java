package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.data.AbstractGeneratorName;

public final class GeneratorShortName extends AbstractGeneratorName {

    @NonNull
    private static final GeneratorShortName INSTANCE = new GeneratorShortName();

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
        GeneratorShortNameFemale.getInstance(),
        GeneratorShortNameMale.getInstance()
    };

    @NonNull
    private GeneratorShortName() {
    }

    @NonNull
    public static GeneratorShortName getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
