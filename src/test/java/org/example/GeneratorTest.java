package org.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import ru.volnenko.generator.Generator;

public class GeneratorTest {

    @Test
    public void uuidTest() {
        assertNotNull(Generator.uuid());
    }

}
