package ru.volnenko.generator.data;

import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorFirstNameFemale {

    private final static String[] DATA = new String[] {
            "Алёна", "Алла", "Анна", "Анастасия", "Вера", "Валерия", "Виктория",
            "Василиса", "Галина", "Дарья", "Екатерина", "Елена", "Евгения",
            "Ирина", "Кристина", "Ксения", "Лариса", "Надежда", "Оксана", "Олеся",
            "Полина", "Татьяна", "Тамара", "Юлия", "Яна", "Алиса", "Ольга", "Мария",
            "Марина", "Наталья", "Карина"
    };

    private GeneratorFirstNameFemale() {
    }

    public static String generate() {
        return RandomUtil.random(DATA);
    }

}
