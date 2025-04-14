package ru.volnenko.generator.server.controller;

import lombok.NonNull;
import ru.volnenko.generator.server.model.NameDto;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/geo/")
@Produces(MediaType.APPLICATION_JSON)
public interface IGeoController {

    @GET
    @NonNull
    @Path("/ping")
    ResultDto ping();

    @GET
    @NonNull
    @Path("/city/one/name")
    NameDto generateOneCityName();

    @GET
    @NonNull
    @Path("/street/one/name")
    NameDto generateOneStreetName();

}
