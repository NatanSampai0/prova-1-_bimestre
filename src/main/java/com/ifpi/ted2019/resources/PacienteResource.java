package com.ifpi.ted2019.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Paciente;
import com.ifpi.ted2019.services.PacienteService;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {
	@Autowired
	private PacienteService service;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Paciente object = service.buscar(id);
		return ResponseEntity.ok().body(object);
	}

}