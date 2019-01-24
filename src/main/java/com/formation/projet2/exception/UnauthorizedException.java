package com.formation.projet2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {

	private static final long serialVersionUID = -1749672976230392283L;
	
	public UnauthorizedException() {
	}
	
	public UnauthorizedException(String msg) {
		super(msg);
	}
}
