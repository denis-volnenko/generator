package ru.volnenko.generator;

import org.junit.Assert;
import org.junit.Test;
import ru.volnenko.generator.data.person.GeneratorFirstNameFemale;
import ru.volnenko.generator.data.person.GeneratorFirstNameMale;

public final class GeneratorFirstNameTest {

    @Test
    public void testFirstName() {
        Assert.assertNotNull(GeneratorFirstNameMale.getInstance().generate());
        Assert.assertFalse(GeneratorFirstNameMale.getInstance().generate().isEmpty());
    }

    @Test
    public void testFirstNameMale() {
        Assert.assertNotNull(GeneratorFirstNameMale.getInstance().generate());
        Assert.assertFalse(GeneratorFirstNameMale.getInstance().generate().isEmpty());
    }

    @Test
    public void testLastNameFemale() {
        Assert.assertNotNull(GeneratorFirstNameFemale.getInstance().generate());
        Assert.assertFalse(GeneratorFirstNameFemale.getInstance().generate().isEmpty());
    }

}
