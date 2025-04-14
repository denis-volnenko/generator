package ru.volnenko.generator.server.controller.impl;

import lombok.NonNull;
import ru.volnenko.generator.server.controller.IMaleController;
import ru.volnenko.generator.server.model.FullNameDto;
import ru.volnenko.generator.server.model.NameDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/male/")
@Produces(MediaType.APPLICATION_JSON)
public final class MaleController implements IMaleController {

    @GET
    @NonNull
    @Override
    @Path("/full/name/one")
    public FullNameDto generateOneFullNameMale() {
        return new FullNameDto();
    }

    @GET
    @NonNull
    @Override
    @Path("/first/name/one")
    public NameDto generateOneFirstNameMale() {
        return new NameDto();
    }

}
