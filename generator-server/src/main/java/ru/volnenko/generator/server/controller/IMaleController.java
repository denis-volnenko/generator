package ru.volnenko.generator.server.controller;

import lombok.NonNull;
import ru.volnenko.generator.server.model.FullNameDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/male/")
@Produces(MediaType.APPLICATION_JSON)
public interface IMaleController {

    @GET
    @NonNull
    @Path("/full/name/one")
    FullNameDto generateOneFullNameMale();

}
