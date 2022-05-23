package com.andre.cursojava.aula54;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(23, 5, 2021, DiaSemana.SEGUNDA );

	}

}
