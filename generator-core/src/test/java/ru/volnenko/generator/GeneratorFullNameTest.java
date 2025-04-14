package ru.volnenko.generator;

import org.junit.Assert;
import org.junit.Test;
import ru.volnenko.generator.data.person.GeneratorFullName;
import ru.volnenko.generator.data.person.GeneratorFullNameFemale;
import ru.volnenko.generator.data.person.GeneratorFullNameMale;

public final class GeneratorFullNameTest {

    @Test
    public void testFullName() {
        Assert.assertNotNull(GeneratorFullName.getInstance().generate());
        Assert.assertFalse(GeneratorFullName.getInstance().generate().isEmpty());
    }

    @Test
    public void testFullNameMale() {
        Assert.assertNotNull(GeneratorFullNameMale.getInstance().generate());
        Assert.assertFalse(GeneratorFullNameMale.getInstance().generate().isEmpty());
    }

    @Test
    public void testFullNameFemale() {
        Assert.assertNotNull(GeneratorFullNameFemale.getInstance().generate());
        Assert.assertFalse(GeneratorFullNameFemale.getInstance().generate().isEmpty());
    }

}
