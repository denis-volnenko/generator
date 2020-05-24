package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;

public final class GeneratorLastNameFemale implements IGeneratorName {

    @NonNull
    private static final GeneratorLastNameFemale INSTANCE = new GeneratorLastNameFemale();

    @NonNull
    private static final String SUFFIX = "а";

    @NonNull
    public static GeneratorLastNameFemale getInstance() {
        return INSTANCE;
    }

    @Override
    public String generate() {
        return GeneratorLastNameMale.getInstance().generate() + SUFFIX;
    }

}
