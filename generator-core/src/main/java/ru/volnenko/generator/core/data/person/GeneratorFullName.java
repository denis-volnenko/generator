package ru.volnenko.generator.core.data.person;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.data.AbstractGeneratorName;

/**
 * Генератор случайного ФИО
 */
public final class GeneratorFullName extends AbstractGeneratorName {

    @NonNull
    private static final GeneratorFullName INSTANCE = new GeneratorFullName();

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorFullNameMale.getInstance(), GeneratorFullNameFemale.getInstance()
    };

    @NonNull
    public static GeneratorFullName getInstance() {
        return INSTANCE;
    }

    @Override
    protected @NonNull IGeneratorName[] getGenerators() {
        return GENERATORS;
    }

}
