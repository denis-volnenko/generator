package ru.volnenko.generator.server.controller;

import lombok.NonNull;
import ru.volnenko.generator.server.model.FullNameDto;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/female/")
@Produces(MediaType.APPLICATION_JSON)
public interface IFemaleController {

    @GET
    @NonNull
    @Path("/ping")
    ResultDto ping();

    @GET
    @NonNull
    @Path("/full/name/female/one")
    FullNameDto generateOneFullNameFemale();

}
