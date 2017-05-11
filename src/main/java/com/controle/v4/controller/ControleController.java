package com.controle.v4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.controle.v4.entity.Controle;
import com.controle.v4.representation.ControleRepresentation;
import com.controle.v4.service.ControleService;

@CrossOrigin
@RestController
@RequestMapping("/controles")
public class ControleController {

	@Autowired
	private ControleService controleService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<List<ControleRepresentation>> listAll() {
		List<Controle> controles = controleService.findAll();
		List<ControleRepresentation> controleRepresentation = new ArrayList<>();
		for (Controle c : controles) {
			controleRepresentation.add(new ControleRepresentation(c));
		}
		return ResponseEntity.ok(controleRepresentation);
	}
}
