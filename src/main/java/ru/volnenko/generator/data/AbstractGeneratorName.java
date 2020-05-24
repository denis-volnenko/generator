package ru.volnenko.generator.data;

import ru.volnenko.generator.api.GeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public abstract class AbstractGeneratorName implements GeneratorName {

    protected abstract GeneratorName[] getGenerators();

    @Override
    public String generate() {
        return RandomUtil.random(getGenerators()).generate();
    }

}
