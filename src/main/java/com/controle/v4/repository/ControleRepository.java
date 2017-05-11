package com.controle.v4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.v4.entity.Controle;

@Repository
public interface ControleRepository extends JpaRepository<Controle, Long> {

}
