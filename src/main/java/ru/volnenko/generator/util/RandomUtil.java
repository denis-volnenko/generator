package ru.volnenko.generator.util;

import java.util.Random;

public final class RandomUtil {

    private RandomUtil() {
    }

    public static <T> T random(T... values) {
        final int index = RandomUtil.random(0, values.length -1);
        return values[index];
    }

    public static int random(int min, int max) {
        if (min >= max) throw new IllegalArgumentException("max must be greater than min");
        final Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static long random(long min, long max) {
        if (min >= max) throw new IllegalArgumentException("max must be greater than min");
        final Random random = new Random();
        return min+((long)(random.nextDouble()*(max-min)));
    }

}
