package ru.volnenko.generator.data;

import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorFirstNameMale {

    private final static String[] DATA = new String[] {
            "Сергей", "Иван", "Антон", "Николай", "Петр", "Федор",
            "Павел", "Максим", "Владимир", "Вадим", "Вячеслав", "Василий",
            "Егор", "Игорь", "Олег", "Степан", "Артем", "Юрий", "Ярослав",
            "Аркадий", "Арсений", "Матвей", "Леонид", "Михаил", "Алексей",
            "Александр", "Борис", "Валентин", "Виталий", "Глеб", "Роман",
            "Евгений", "Тимур", "Эдуард", "Кирилл", "Ярослав"
    };

    private GeneratorFirstNameMale() {
    }

    public static String generate() {
        return RandomUtil.random(DATA);
    }

}
