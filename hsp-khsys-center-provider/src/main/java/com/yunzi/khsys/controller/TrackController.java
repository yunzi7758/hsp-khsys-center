package com.yunzi.khsys.controller;

import com.yunzi.khsys.service.TrackService;
import com.yunzi.khsys.domain.eo.Track;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/Track")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class TrackController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TrackService TrackService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam Track eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(TrackService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam Track eo) {
        return new Payload(TrackService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(TrackService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(Track eo) {
        return new Payload(TrackService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, Track eo) {
        return new Payload(TrackService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(TrackService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(TrackService.delete(pks));
    }
}
