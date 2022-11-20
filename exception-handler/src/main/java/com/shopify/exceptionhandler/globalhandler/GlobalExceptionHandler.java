package com.shopify.exceptionhandler.globalhandler;

import com.shopify.exceptionhandler.exceptions.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;
import java.util.Date;

@ComponentScan(basePackages = { "com.shopify.exceptionhandler", "com.shopify.authserver.controller"})
@ControllerAdvice(basePackages = { "com.shopify.authserver.controller"})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

	@ExceptionHandler({ AccountNotFoundException.class })
	public ResponseEntity<Parent> accountNotFoundException(Exception exception, WebRequest webRequest) {

		Parent parent = prepareErrorResponse(exception.getLocalizedMessage(), 404);

		return new ResponseEntity<>(parent, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler({ UsernameAlreadyExistsException.class })
	public ResponseEntity<Parent> usernameAlreadyExistsException(Exception exception, WebRequest webRequest) {

		Parent parent = prepareErrorResponse(exception.getLocalizedMessage(), 400);

		return new ResponseEntity<>(parent, HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler({ConstraintViolationException.class})
	public ResponseEntity<Parent> constraintViolationException(Exception exception, WebRequest webRequest) {
		Parent parent = prepareErrorResponse(exception.getLocalizedMessage(), 400);
		return new ResponseEntity<>(parent, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({RoleNotFoundException.class})
	public ResponseEntity<Parent> roleNotFoundException(Exception exception, WebRequest webRequest) {
		Parent parent = prepareErrorResponse(exception.getLocalizedMessage(), 400);
		return new ResponseEntity<>(parent, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({TokenNotProvidedException.class})
	public ResponseEntity<Parent> tokenNotProvidedException(Exception exception, WebRequest webRequest) {
		Parent parent = prepareErrorResponse(exception.getLocalizedMessage(), 400);
		return new ResponseEntity<>(parent, HttpStatus.BAD_REQUEST);
	}
	
	private Parent prepareErrorResponse(String message, int errorCode) {
		Child child = new Child();
		child.setMessage(message);
		child.setErrorCode(errorCode);
		child.setTimeStamp(new Date());
		child.setDeveloperEmail("aman@gmail.com");

		Parent parent = new Parent();
		parent.setMessage("Bad Request");
		parent.setErrorCode(errorCode);
		parent.setChild(child);
		
		return parent;
	}

}
