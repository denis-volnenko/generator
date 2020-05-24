package ru.volnenko.generator.data;

import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public abstract class AbstractGeneratorName implements IGeneratorName {

    protected abstract IGeneratorName[] getGenerators();

    @Override
    public String generate() {
        return RandomUtil.random(getGenerators()).generate();
    }

}
