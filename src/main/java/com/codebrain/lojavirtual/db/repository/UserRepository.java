package com.codebrain.lojavirtual.db.repository;

import java.util.List;

import com.codebrain.lojavirtual.db.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findByNome(String nome);
}