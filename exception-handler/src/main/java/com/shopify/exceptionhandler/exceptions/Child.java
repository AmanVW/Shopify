package com.shopify.exceptionhandler.exceptions;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Child {
	private String message;
	private int errorCode;
	private Date timeStamp;
	private String developerEmail;
}
