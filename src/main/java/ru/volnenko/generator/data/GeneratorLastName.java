package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGenerator;

public final class GeneratorLastName extends AbstractGeneratorName implements IGenerator<String> {

    private static final GeneratorLastName INSTANCE = new GeneratorLastName();

    private static final IGenerator<String>[] GENERATORS = new IGenerator[] {
            GeneratorLastNameMale.getInstance(), GeneratorLastNameFemale.getInstance()
    };

    public static GeneratorLastName getInstance() {
        return INSTANCE;
    }

    @Override
    protected IGenerator<String>[] getGenerators() {
        return GENERATORS;
    }

    private GeneratorLastName() {
    }

}
