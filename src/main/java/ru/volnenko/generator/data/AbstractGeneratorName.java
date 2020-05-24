package ru.volnenko.generator.data;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public abstract class AbstractGeneratorName implements IGeneratorName {

    @NonNull
    protected abstract IGeneratorName[] getGenerators();

    @NonNull
    @Override
    public String generate() {
        return RandomUtil.random(getGenerators()).generate();
    }

}
