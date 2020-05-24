package ru.volnenko.generator.data.person;

import ru.volnenko.generator.api.GeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorFirstNameFemale implements GeneratorName {

    private static final GeneratorFirstNameFemale INSTANCE = new GeneratorFirstNameFemale();

    private final static String[] DATA = new String[] {
            "Алёна", "Алла", "Анна", "Анастасия", "Вера", "Валерия", "Виктория",
            "Василиса", "Галина", "Дарья", "Екатерина", "Елена", "Евгения",
            "Ирина", "Кристина", "Ксения", "Лариса", "Надежда", "Оксана", "Олеся",
            "Полина", "Татьяна", "Тамара", "Юлия", "Яна", "Алиса", "Ольга", "Мария",
            "Марина", "Наталья", "Карина"
    };

    public static GeneratorFirstNameFemale getInstance() {
        return INSTANCE;
    }

    private GeneratorFirstNameFemale() {
    }

    public String generate() {
        return RandomUtil.random(DATA);
    }

}
