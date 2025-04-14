package ru.volnenko.generator.server.controller;

import lombok.NonNull;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/name/")
@Produces(MediaType.APPLICATION_JSON)
public interface INameController {

    @GET
    @NonNull
    @Path("/ping")
    ResultDto ping();

}
