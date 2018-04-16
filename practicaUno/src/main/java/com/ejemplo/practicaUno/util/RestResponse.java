package com.ejemplo.practicaUno.util;

public class RestResponse {
	
	private Integer codigoError;
	
	private String mensaje;
	
	
	public RestResponse(Integer codigoError, String mensaje) {
		this.codigoError = codigoError;
		this.mensaje = mensaje;
	}

	

	public Integer getCodigoError() {
		return codigoError;
	}



	public void setCodigoError(Integer codigoError) {
		this.codigoError = codigoError;
	}



	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
