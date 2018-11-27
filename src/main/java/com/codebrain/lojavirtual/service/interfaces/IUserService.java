package com.codebrain.lojavirtual.service.interfaces;

import com.codebrain.lojavirtual.db.entity.User;
import com.codebrain.lojavirtual.dto.UserDto;
import com.codebrain.lojavirtual.service.exceptions.UserServiceException;

public interface IUserService {

  public User createUser(UserDto user);

  public User updateUser(User user);

  public Iterable<User> getAll();

  public User getById(Long id) throws UserServiceException;

  public void delete(Long id);
}