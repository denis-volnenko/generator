package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorMiddleName implements IGeneratorName {

    @NonNull
    private static final IGeneratorName[] GENERATORS = new IGeneratorName[] {
            GeneratorMiddleNameFemale.getInstance(), GeneratorMiddleNameMale.getInstance(),
    };

    @Override
    public String generate() {
        return RandomUtil.random(GENERATORS).generate();
    }

}
