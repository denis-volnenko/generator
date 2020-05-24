package ru.volnenko.generator;

import java.util.UUID;

public final class Generator {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

}
