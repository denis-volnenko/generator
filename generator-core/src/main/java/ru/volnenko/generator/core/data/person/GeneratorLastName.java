package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.data.AbstractGeneratorName;

/**
 * Генератор случайной фамилии
 */
public final class GeneratorLastName extends AbstractGeneratorName {

    @NonNull
    private static final GeneratorLastName INSTANCE = new GeneratorLastName();

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorLastNameMale.getInstance(), GeneratorLastNameFemale.getInstance()
    };

    @NonNull
    public static GeneratorLastName getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    protected IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorLastName() {
    }

}
