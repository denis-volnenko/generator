package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.data.AbstractGeneratorName;

public final class GeneratorFirstName extends AbstractGeneratorName {

    @NonNull
    private static final GeneratorFirstName INSTANCE = new GeneratorFirstName();

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorFirstNameMale.getInstance(), GeneratorFirstNameFemale.getInstance()
    };

    @NonNull
    public static GeneratorFirstName getInstance() {
        return INSTANCE;
    }

    @NonNull
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorFirstName() {
    }

}
