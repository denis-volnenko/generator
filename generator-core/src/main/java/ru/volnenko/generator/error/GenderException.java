package ru.volnenko.generator.error;

public class GenderException extends RuntimeException {

    public GenderException() {
        super("Ошибка! Не правильное значение пола...");
    }

}
