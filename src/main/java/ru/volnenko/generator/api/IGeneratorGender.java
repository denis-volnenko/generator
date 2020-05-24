package ru.volnenko.generator.api;

import lombok.NonNull;

public interface IGeneratorGender {

    @NonNull
    IGeneratorPerson person();

    @NonNull
    IGeneratorName firstName();

    @NonNull
    IGeneratorName lastName();

}
