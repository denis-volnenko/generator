package ru.volnenko.generator.server.controller.impl;

import lombok.NonNull;
import ru.volnenko.generator.server.controller.IGeoController;
import ru.volnenko.generator.server.model.NameDto;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator/api/v1/geo/")
@Produces(MediaType.APPLICATION_JSON)
public final class GeoController implements IGeoController {

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
    @Path("/city/one/name")
    public NameDto generateOneCityName() {
        return new NameDto();
    }

    @GET
    @NonNull
    @Override
    @Path("/street/one/name")
    public NameDto generateOneStreetName() {
        return new NameDto();
    }

    @GET
    @NonNull
    @Override
    @Path("/state/one/name")
    public NameDto generateOneStateName() {
        return null;
    }

}
