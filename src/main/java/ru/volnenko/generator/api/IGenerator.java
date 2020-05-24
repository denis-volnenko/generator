package ru.volnenko.generator.api;

import lombok.NonNull;

public interface IGenerator<T> {

    @NonNull
    T generate();

}
