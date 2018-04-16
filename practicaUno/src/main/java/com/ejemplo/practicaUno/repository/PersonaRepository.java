package com.ejemplo.practicaUno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.practicaUno.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
	Persona findByIdPersona(Long idPersona);
	
	@SuppressWarnings("unchecked")
	Persona save(Persona persona);

	List<Persona> findByNombrePersona(String nombrePersona);
}
