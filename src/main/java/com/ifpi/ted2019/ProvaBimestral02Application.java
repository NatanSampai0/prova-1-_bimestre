package com.ifpi.ted2019;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifpi.ted2019.domain.Paciente;
import com.ifpi.ted2019.repositories.PacienteRepository;

@SpringBootApplication
public class ProvaBimestral02Application implements CommandLineRunner{

	@Autowired
	private PacienteRepository pacienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProvaBimestral02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Paciente paciente = new Paciente(null,"joão", "10");
		Paciente paciente2 = new Paciente(null,"maria", "11");
		
		pacienteRepository.saveAll(Arrays.asList(paciente, paciente2));
		/*pacienteRepository.deleteAll(Arrays.asList(paciente, paciente2));*/
	}

}