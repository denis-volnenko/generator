package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGenerator;
import ru.volnenko.generator.util.RandomUtil;

public class GeneratorFirstName implements IGenerator<String> {

    private static final GeneratorFirstName INSTANCE = new GeneratorFirstName();

    private static final IGenerator<String>[] GENERATORS = new IGenerator[] {
            GeneratorFirstNameMale.getInstance(), GeneratorFirstNameFemale.getInstance()
    };

    public static GeneratorFirstName getInstance() {
        return INSTANCE;
    }

    private GeneratorFirstName() {
    }

    @Override
    public String generate() {
        return RandomUtil.random(GENERATORS).generate();
    }

}
