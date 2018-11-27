package com.codebrain.lojavirtual.dto;

import com.codebrain.lojavirtual.db.entity.User;

public class UserDto {

  private String nome;
  private String email;

  public UserDto(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public UserDto() {
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", email='" + getEmail() + "'" + "}";
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User transformaParaObjeto() {
    return new User(nome, email);
  }
}