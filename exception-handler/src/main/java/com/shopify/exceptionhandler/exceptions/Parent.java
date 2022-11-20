package com.shopify.exceptionhandler.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parent {

	private String message;
	private int errorCode;
	private Child child;
}
