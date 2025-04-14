package ru.volnenko.generator.server.controller.impl;

import lombok.NonNull;
import ru.volnenko.generator.server.controller.INameController;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/geo/")
@Produces(MediaType.APPLICATION_JSON)
public final class NameController implements INameController {

    @GET
    @NonNull
    @Override
    @Path("/ping")
    public ResultDto ping() {
        return null;
    }

}
