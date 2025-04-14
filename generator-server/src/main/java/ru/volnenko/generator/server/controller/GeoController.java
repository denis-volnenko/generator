package ru.volnenko.generator.server.controller;

import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/geo/api/v1/")
@Produces(MediaType.APPLICATION_JSON)
public final class GeoController {

    @GET
    @Path("/ping")
    public ResultDto ping() {
        return new ResultDto();
    }

}
