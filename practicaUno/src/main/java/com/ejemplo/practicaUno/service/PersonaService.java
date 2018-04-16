package com.ejemplo.practicaUno.service;

import java.util.List;

import com.ejemplo.practicaUno.model.Persona;



public interface PersonaService {
	
	/**
	 * Metodo que guarda o actualiza una persona
	 * @param persona
	 * @return
	 */
	public Persona saveOrUpdate(Persona persona);
	
	
	/**
	 * Metodo que consulta todas la personas en la base de datos
	 * @return
	 */
	public List<Persona> findAllPersonas();
	
	
	/**
	 * Metodo que consulta las personas por nombre
	 * @param nombrePersona
	 * @return
	 */
	public List<Persona> findPersonaByNombre(String nombrePersona);

}
