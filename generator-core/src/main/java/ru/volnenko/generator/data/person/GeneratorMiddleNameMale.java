package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorMiddleNameMale implements IGeneratorName {

    @NonNull
    private static final GeneratorMiddleNameMale INSTANCE = new GeneratorMiddleNameMale();

    @NonNull
    private final static String[] DATA = new String[] {
            "Матвеевич", "Петрович", "Ефимович", "Андреевич", "Алексеевич",
            "Анатольевич", "Николаевич", "Павлович", "Олегович", "Борисович",
            "Игоревич", "Иванович", "Фёдорович", "Эдуардович", "Макарович"
    };

    @NonNull
    public static GeneratorMiddleNameMale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public String generate() {
        return RandomUtil.random(DATA);
    }

}
