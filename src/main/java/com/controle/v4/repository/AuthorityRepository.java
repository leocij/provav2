package com.controle.v4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.v4.entity.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities, String> {

}
