package ru.volnenko.generator.core.api;

import lombok.NonNull;

public interface IGenerator<T> {

    @NonNull
    T generate();

}
