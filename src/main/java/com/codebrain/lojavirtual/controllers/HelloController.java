package com.codebrain.lojavirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@Api(value = "hello", description = "Teste de rota swagger")
public class HelloController {

    @ApiOperation(value = "Get Message")
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/rota2", method = RequestMethod.GET, produces = "application/json")
    public String testeSwagger() {
        return "Rota 2 foi!";
    }

}