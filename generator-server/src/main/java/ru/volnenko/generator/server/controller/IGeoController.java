package ru.volnenko.generator.server.controller;

import ru.volnenko.generator.server.model.NameDto;
import ru.volnenko.generator.server.model.ResultDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface IGeoController {

    @GET
    @Path("/ping")
    ResultDto ping();

    @GET
    @Path("/city/one/name")
    NameDto generateOneCityName();

    @GET
    @Path("/street/one/name")
    public NameDto generateOneStreetName();

}
