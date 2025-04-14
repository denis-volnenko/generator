package ru.volnenko.generator.core.data;

import lombok.NonNull;
import ru.volnenko.generator.core.api.IGeneratorName;
import ru.volnenko.generator.core.util.RandomUtil;

public abstract class AbstractGeneratorName implements IGeneratorName {

    @NonNull
    protected abstract IGeneratorName[] getGenerators();

    @NonNull
    @Override
    public String generate() {
        return RandomUtil.random(getGenerators()).generate();
    }

}
