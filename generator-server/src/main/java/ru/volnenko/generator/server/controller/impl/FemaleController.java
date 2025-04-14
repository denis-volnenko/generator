package ru.volnenko.generator.server.controller.impl;

import lombok.NonNull;
import ru.volnenko.generator.server.controller.IFemaleController;
import ru.volnenko.generator.server.model.FullNameDto;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/female/")
@Produces(MediaType.APPLICATION_JSON)
public final class FemaleController implements IFemaleController {

    @GET
    @NonNull
    @Override
    @Path("/ping")
    public ResultDto ping() {
        return new ResultDto();
    }

    @GET
    @NonNull
    @Override
    @Path("/full/name/female/one")
    public FullNameDto generateOneFullNameFemale() {
        return new FullNameDto();
    }

}
