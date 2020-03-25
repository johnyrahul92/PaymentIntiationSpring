package com.gbk.h2h.inputprocessor.controller;

import com.gbk.h2h.inputprocessor.beans.BeanClass;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@RestController
@RequestMapping("/InputProcessor")
@Api(value = "Input processor")
@CrossOrigin
public class Controller {

    @PostMapping("/route-details")
    @Consumes("Application/json")
    @Produces("Application/json")
    @ApiOperation(value = "Get All Routes available in Camel context", response = BeanClass.class)
    public BeanClass getCamelRouteDetails() {

        BeanClass response = new BeanClass();

        response.setFname("Shubham");
        response.setLname("Srivastava");

        return response;
    }
}
