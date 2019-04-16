package com.yunzi.khsys.controller;

import com.yunzi.khsys.domain.eo.Member;
import com.yunzi.khsys.service.CustomService;
import com.yunzi.khsys.domain.eo.Custom;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.List;

@Service
@Path("/api/v1/Custom")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class CustomController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomService CustomService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam Custom eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(CustomService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam Custom eo) {
        return new Payload(CustomService.findAll(eo));
    }

    @POST
    @Path("/forSelect")
    public Payload forSelect(@BeanParam Custom eo) {
        List<Custom> all = CustomService.findAll(eo);
        Custom[] objects = {};
        objects = all.toArray(objects);
        return new Payload(objects);
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(CustomService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(Custom eo) {
        return new Payload(CustomService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, Custom eo) {
        return new Payload(CustomService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(CustomService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(CustomService.delete(pks));
    }
}
