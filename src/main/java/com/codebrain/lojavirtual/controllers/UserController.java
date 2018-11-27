package com.codebrain.lojavirtual.controllers;

import com.codebrain.lojavirtual.db.entity.User;
import com.codebrain.lojavirtual.dto.UserDto;
import com.codebrain.lojavirtual.service.exceptions.UserServiceException;
import com.codebrain.lojavirtual.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting Users.")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "Cria um usuário")
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {

        User response = userService.createUser(userDto);
        return new ResponseEntity<User>(response, HttpStatus.OK);
    }

    @ApiOperation(value = "Busca Todos Usuários")
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Iterable<User> getAll() {
        return userService.getAll();
    }

    @ApiOperation(value = "Busca usuário pelo id")
    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> getUser(@ApiParam("Id of the user. Cannot be empty.") @PathVariable Long id)
            throws UserServiceException {

        User user = userService.getById(id);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    // TODO
    @ApiOperation(value = "Atualiza um usuário")
    @RequestMapping(path = "/user/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<User> updateUser(@RequestBody User User,
            @ApiParam("Id of the user to be updated. Cannot be empty.") @PathVariable Long id) {
        System.out.print(User.toString());

        return new ResponseEntity<User>(User, HttpStatus.OK);
    }

    // TODO
    @ApiOperation(value = "Deleta um usuário")
    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteUser(@RequestBody User User,
            @ApiParam("Id of the user to be updated. Cannot be empty.") @PathVariable Long id) {
        System.out.print(User.toString());

        return new ResponseEntity<>(HttpStatus.OK);
    }

}