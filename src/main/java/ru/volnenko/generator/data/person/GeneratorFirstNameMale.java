package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorFirstNameMale implements IGeneratorName {

    @NonNull
    public static final GeneratorFirstNameMale INSTANCE = new GeneratorFirstNameMale();

    @NonNull
    private final static String[] DATA = new String[] {
            "Сергей", "Иван", "Антон", "Николай", "Петр", "Федор",
            "Павел", "Максим", "Владимир", "Вадим", "Вячеслав", "Василий",
            "Егор", "Игорь", "Олег", "Степан", "Артем", "Юрий", "Ярослав",
            "Аркадий", "Арсений", "Матвей", "Леонид", "Михаил", "Алексей",
            "Александр", "Борис", "Валентин", "Виталий", "Глеб", "Роман",
            "Евгений", "Тимур", "Эдуард", "Кирилл", "Ярослав"
    };

    @NonNull
    public static GeneratorFirstNameMale getInstance() {
        return INSTANCE;
    }

    private GeneratorFirstNameMale() {
    }

    @NonNull
    public String generate() {
        return RandomUtil.random(DATA);
    }

}
