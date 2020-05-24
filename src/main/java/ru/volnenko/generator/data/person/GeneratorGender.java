package ru.volnenko.generator.data.person;

import lombok.NonNull;
import ru.volnenko.generator.api.IGeneratorGender;

public final class GeneratorGender {

    @NonNull
    private static final GeneratorGender INSTANCE = new GeneratorGender();

    @NonNull
    public static GeneratorGender getInstance() {
        return INSTANCE;
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
