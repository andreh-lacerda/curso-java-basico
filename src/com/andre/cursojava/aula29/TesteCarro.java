package com.andre.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.setMarca("Fiat");
		
		System.out.println(van.getMarca());
		
		van.setModelo("Ducato");
		van.setNumeroPassageiros(10);
		van.setCapacidadeCombustivel(100);
		van.setConsumoCombustivel(0.2);

	}

}
