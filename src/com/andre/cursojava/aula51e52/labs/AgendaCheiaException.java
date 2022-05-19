package com.andre.cursojava.aula51e52.labs;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}
