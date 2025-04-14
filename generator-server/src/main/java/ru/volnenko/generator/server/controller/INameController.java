package ru.volnenko.generator.server.controller;

import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/geo/")
@Produces(MediaType.APPLICATION_JSON)
public interface INameController {

    @GET
    @Path("/ping")
    ResultDto ping();

}
