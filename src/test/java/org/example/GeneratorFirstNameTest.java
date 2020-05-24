package org.example;

import org.junit.Assert;
import org.junit.Test;
import ru.volnenko.generator.data.GeneratorFirstNameFemale;
import ru.volnenko.generator.data.GeneratorFirstNameMale;

public class GeneratorFirstNameTest {

    @Test
    public void testFirstNameMale() {
        Assert.assertNotNull(GeneratorFirstNameMale.generate());
    }

    @Test
    public void testLastNameFemale() {
        Assert.assertNotNull(GeneratorFirstNameFemale.generate());
    }

}
