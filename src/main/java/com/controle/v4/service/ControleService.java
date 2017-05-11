package com.controle.v4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.controle.v4.entity.Controle;
import com.controle.v4.repository.ControleRepository;

@Service
public class ControleService {

	@Autowired
	private ControleRepository controleRepository;

	@Transactional(readOnly = true)
	public List<Controle> findAll() {
		return controleRepository.findAll();
	}

}
