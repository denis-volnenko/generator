package ru.volnenko.generator.server.controller.impl;

import lombok.NonNull;
import ru.volnenko.generator.server.controller.INameController;
import ru.volnenko.generator.server.model.FullNameDto;
import ru.volnenko.generator.server.model.ResultDto;

public final class NameController implements INameController {

    @NonNull
    @Override
    public ResultDto ping() {
        return null;
    }

    @NonNull
    @Override
    public FullNameDto generateOneFullNameMale() {
        return null;
    }

    @NonNull
    @Override
    public FullNameDto generateOneFullNameFemale() {
        return null;
    }

}
