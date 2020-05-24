package ru.volnenko.generator;

import java.util.Date;
import java.util.UUID;

public final class Generator {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static Long timestamp() {
        return System.currentTimeMillis();
    }

    public static Date now() {
        return new Date();
    }

}
