package com.productorder.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("ResourceNotFound. Id " + id);
	}
}
