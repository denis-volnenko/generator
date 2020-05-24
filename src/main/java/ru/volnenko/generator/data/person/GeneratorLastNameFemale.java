package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorLastNameFemale implements IGeneratorName {

    private static final GeneratorLastNameFemale INSTANCE = new GeneratorLastNameFemale();

    private static final String SUFFIX = "а";

    public static GeneratorLastNameFemale getInstance() {
        return INSTANCE;
    }

    @Override
    public String generate() {
        return GeneratorLastNameMale.getInstance().generate() + SUFFIX;
    }

}
