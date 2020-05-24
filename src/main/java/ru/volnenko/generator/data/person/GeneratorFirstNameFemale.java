package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorFirstNameFemale implements IGeneratorName {

    @NonNull
    private static final GeneratorFirstNameFemale INSTANCE = new GeneratorFirstNameFemale();

    @NonNull
    private final static String[] DATA = new String[] {
            "Алёна", "Алла", "Анна", "Анастасия", "Вера", "Валерия", "Виктория",
            "Василиса", "Галина", "Дарья", "Екатерина", "Елена", "Евгения",
            "Ирина", "Кристина", "Ксения", "Лариса", "Надежда", "Оксана", "Олеся",
            "Полина", "Татьяна", "Тамара", "Юлия", "Яна", "Алиса", "Ольга", "Мария",
            "Марина", "Наталья", "Карина"
    };

    @NonNull
    public static GeneratorFirstNameFemale getInstance() {
        return INSTANCE;
    }

    private GeneratorFirstNameFemale() {
    }

    @NonNull
    public String generate() {
        return RandomUtil.random(DATA);
    }

}
