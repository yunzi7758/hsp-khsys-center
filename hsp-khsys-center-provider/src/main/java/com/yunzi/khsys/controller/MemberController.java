package com.yunzi.khsys.controller;

import com.alibaba.fastjson.JSON;
import com.yunzi.khsys.service.MemberService;
import com.yunzi.khsys.domain.eo.Member;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.List;

@Service
@Path("/api/v1/Member")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class MemberController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberService MemberService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam Member eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(MemberService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam Member eo) {
        return new Payload(MemberService.findAll(eo));
    }

    @POST
    @Path("/forSelect")
    public Payload forSelect(@BeanParam Member eo) {
        List<Member> all = MemberService.forSelect(eo);
        Member[] objects = {};
        objects = all.toArray(objects);
        return new Payload(objects);
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") String pk) {
        return new Payload(MemberService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(Member eo) {
        return new Payload(MemberService.create(eo));
    }

    @POST
    @Path("/login")
    public Payload login(Member eo) {
        return new Payload(MemberService.findAll(eo).get(0));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") String pk, Member eo) {
        return new Payload(MemberService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") String pk) {
        return new Payload(MemberService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(String[] pks) {
        return new Payload(MemberService.delete(pks));
    }
}
