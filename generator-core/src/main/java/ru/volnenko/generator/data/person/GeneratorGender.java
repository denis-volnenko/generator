package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorGender;
import ru.volnenko.generator.error.GenderException;
import ru.volnenko.generator.model.Gender;

public final class GeneratorGender {

    @NonNull
    private static final GeneratorGender INSTANCE = new GeneratorGender();

    @NonNull
    public static GeneratorGender getInstance() {
        return INSTANCE;
    }

    @NonNull
    public static IGeneratorGender valueOf(@NonNull Gender gender) {
        if (Gender.MALE.equals(gender)) return GeneratorGenderMale.getInstance();
        if (Gender.FEMALE.equals(gender)) return GeneratorGenderFemale.getInstance();
        throw new GenderException();
    }

    @NonNull
    public IGeneratorGender male() {
        return GeneratorGenderMale.getInstance();
    }

    @NonNull
    public IGeneratorGender female() {
        return GeneratorGenderFemale.getInstance();
    }

}
