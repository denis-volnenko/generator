package ru.volnenko.generator.core.api;

import lombok.NonNull;

public interface IGeneratorGender {

    @NonNull
    IGeneratorPerson person();

    @NonNull
    IGeneratorName firstName();

    @NonNull
    IGeneratorName lastName();

    @NonNull
    IGeneratorName middleName();

}
