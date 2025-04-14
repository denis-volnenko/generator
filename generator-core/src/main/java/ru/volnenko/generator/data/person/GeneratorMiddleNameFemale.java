package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorName;
import ru.volnenko.generator.util.RandomUtil;

public final class GeneratorMiddleNameFemale implements IGeneratorName {

    @NonNull
    private static final GeneratorMiddleNameFemale INSTANCE = new GeneratorMiddleNameFemale();

    @NonNull
    private final static String[] DATA = new String[] {
            "Александровна", "Алексеевна", "Анатольевна", "Андреевна", "Антоновна",
            "Аркадьевна", "Афанасьевна", "Даниловна", "Дмитриевна", "Максимовна",
            "Матвеевна", "Михайловна", "Тарасовна", "Тимофеевна", "Богдановна",
            "Борисовна", "Ивановна", "Игоревна", "Олеговна", "Эдуардовна",
            "Валентиновна", "Валериевна", "Васильевна", "Викторовна", "Владимировна",
            "Владиславовна", "Вячеславовна", "Константиновна", "Павловна", "Петровна",
            "Юрьевна", "Геннадиевна", "Георгиевна", "Леонидовна", "Львовна",
            "Семеновна", "Сергеевна", "Станиславовна", "Степановна"
    };

    @NonNull
    public static GeneratorMiddleNameFemale getInstance() {
        return INSTANCE;
    }

    @NonNull
    @Override
    public String generate() {
        return RandomUtil.random(DATA);
    }

}
