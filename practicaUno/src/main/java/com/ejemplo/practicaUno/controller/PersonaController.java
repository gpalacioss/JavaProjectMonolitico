package com.ejemplo.practicaUno.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.practicaUno.model.Persona;
import com.ejemplo.practicaUno.service.PersonaService;
import com.ejemplo.practicaUno.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PersonaController {
	
	@Autowired
	private PersonaService PersonaService;
	
	private ObjectMapper mapper;
	
	@RequestMapping(value = "/guardaPersona", method = RequestMethod.POST)
	public RestResponse guardaPersona(@RequestBody String personaJson) throws JsonParseException, JsonMappingException, IOException {
		
		mapper = new ObjectMapper();
		
		Persona persona = mapper.readValue(personaJson, Persona.class);
		
		if (validaDatosPersona(persona)) {
			PersonaService.saveOrUpdate(persona);
		}else {
			new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los valores son requeridos");
		}
		
		return null;

	}
	
	@RequestMapping(value = "/getPersonas", method = RequestMethod.GET)
	public RestResponse findAllPersonas() {
		List<Persona> result = PersonaService.findAllPersonas();
		
		result.stream().forEach(p -> {
			
			System.out.println("Nombre :: " + p.getNombrePersona());
			System.out.println("Apellido Paterno :: " + p.getaPaterno());
			System.out.println("Apellido Materno :: " + p.getaMaterno());
			
		});
		
		return null;
	}
	
	@RequestMapping(value = "/getPersonaByNombre", method = RequestMethod.GET)
	public RestResponse findPersonaByNombre(@QueryParam("nombrePersona") String nombrePersona){
		
		List<Persona> result = PersonaService.findPersonaByNombre(nombrePersona);
		
		
		result.stream().forEach(p -> {
			
			System.out.println("Nombre :: " + p.getNombrePersona());
			System.out.println("Apellido Paterno :: " + p.getaPaterno());
			System.out.println("Apellido Materno :: " + p.getaMaterno());
			
		});
		
		return null;
	}
	
	private boolean validaDatosPersona(Persona persona) {
		
		boolean datoValido = true; 
		
		if (StringUtils.trimToNull(persona.getNombrePersona()) == null) {
			datoValido = false;
		}
		
		if (StringUtils.trimToNull(persona.getaPaterno()) == null) {
			datoValido = false;
		}
		
		if (StringUtils.trimToNull(persona.getaMaterno()) == null) {
			datoValido = false;
		}
		
		return datoValido;
		
	}
}
