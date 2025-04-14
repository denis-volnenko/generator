package ru.volnenko.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public final class GeneratorTest {

    @Test
    public void uuidTest() {
        assertNotNull(Generator.uuid());
    }

    @Test
    public void test() {
        System.out.println(Generator.fullName());
    }

}
