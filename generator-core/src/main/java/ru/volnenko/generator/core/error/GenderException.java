package ru.volnenko.generator.core.error;

public class GenderException extends RuntimeException {

    public GenderException() {
        super("Ошибка! Не правильное значение пола...");
    }

}
