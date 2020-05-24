package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGenerator;
import ru.volnenko.generator.util.RandomUtil;

public abstract class AbstractGeneratorName implements IGenerator<String> {

    protected abstract IGenerator<String>[] getGenerators();

    @Override
    public String generate() {
        return RandomUtil.random(getGenerators()).generate();
    }

}
