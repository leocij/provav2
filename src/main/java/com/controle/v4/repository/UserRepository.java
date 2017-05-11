package com.controle.v4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.v4.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}
