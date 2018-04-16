package com.ejemplo.practicaUno;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ejemplo.practicaUno.controller.PersonaController;
import com.ejemplo.practicaUno.model.Persona;
import com.ejemplo.practicaUno.service.PersonaService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticaUnoApplicationTests {

	@Autowired
	private PersonaController personaController;

	@Autowired
	private PersonaService PersonaService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void guardaPersona() throws JsonParseException, JsonMappingException, IOException {

		Persona persona = new Persona();

		persona.setIdPersona(null);
		persona.setNombrePersona("Gustavo");
		persona.setaPaterno("Palacios");

		JSONObject jsonObj = new JSONObject();

		jsonObj.put("persona", persona);

		PersonaService.saveOrUpdate(persona);

	}

}
