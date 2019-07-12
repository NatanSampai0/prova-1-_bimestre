package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Paciente;
import com.ifpi.ted2019.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public Paciente buscar(Integer id){
        Optional<Paciente>object= repository.findById(id);
        return object.orElse(null);
	}
}