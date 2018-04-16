package com.ejemplo.practicaUno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.practicaUno.model.Persona;
import com.ejemplo.practicaUno.repository.PersonaRepository;
import com.ejemplo.practicaUno.service.PersonaService;



@Service("personaService")
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public Persona saveOrUpdate(Persona persona) {
		
		 return personaRepository.save(persona);
		
	}
	
	public List<Persona> findAllPersonas() {
		return personaRepository.findAll();
	}
	
	
	public List<Persona> findPersonaByNombre(String nombrePersona){
		
		return personaRepository.findByNombrePersona(nombrePersona);
		
	}
}
