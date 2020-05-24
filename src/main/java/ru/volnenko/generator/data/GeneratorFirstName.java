package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGenerator;

public final class GeneratorFirstName extends AbstractGeneratorName implements IGenerator<String> {

    private static final GeneratorFirstName INSTANCE = new GeneratorFirstName();

    private static final IGenerator<String>[] GENERATORS = new IGenerator[] {
            GeneratorFirstNameMale.getInstance(), GeneratorFirstNameFemale.getInstance()
    };

    public static GeneratorFirstName getInstance() {
        return INSTANCE;
    }

    protected IGenerator<String>[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorFirstName() {
    }

}
