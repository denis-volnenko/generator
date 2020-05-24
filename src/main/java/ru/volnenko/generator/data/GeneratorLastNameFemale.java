package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGenerator;

public final class GeneratorLastNameFemale implements IGenerator<String> {

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
