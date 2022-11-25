package com.Databases.Excepciones;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class ResourceNotFoundExcepcions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepcions (String mensaje) {
		super(mensaje);
	}
	
}