package ru.volnenko.generator;

import org.junit.Assert;
import org.junit.Test;
import ru.volnenko.generator.data.person.*;

public final class GeneratorLastNameTest {

    @Test
    public void testLastName() {
        Assert.assertNotNull(GeneratorLastName.getInstance().generate());
        Assert.assertFalse(GeneratorLastName.getInstance().generate().isEmpty());
    }

    @Test
    public void testLastNameMale() {
        Assert.assertNotNull(GeneratorLastNameMale.getInstance().generate());
        Assert.assertFalse(GeneratorLastNameMale.getInstance().generate().isEmpty());
    }

    @Test
    public void testLastNameFemale() {
        Assert.assertNotNull(GeneratorLastNameFemale.getInstance().generate());
        Assert.assertFalse(GeneratorLastNameFemale.getInstance().generate().isEmpty());
    }

}
