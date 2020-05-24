package org.example;

import org.junit.Assert;
import org.junit.Test;
import ru.volnenko.generator.data.GeneratorFirstNameFemale;
import ru.volnenko.generator.data.GeneratorFirstNameMale;

public class GeneratorFirstNameTest {

    @Test
    public void testFirstName() {
        Assert.assertNotNull(GeneratorFirstNameMale.getInstance().generate());
    }

    @Test
    public void testFirstNameMale() {
        Assert.assertNotNull(GeneratorFirstNameMale.getInstance().generate());
    }

    @Test
    public void testLastNameFemale() {
        Assert.assertNotNull(GeneratorFirstNameFemale.getInstance().generate());
    }

}
