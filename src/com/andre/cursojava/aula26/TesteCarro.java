package com.andre.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		
		double quantidadeCombustivel10 = van.calcularCombustivel(10);
		double quantidadeCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("quantidade de combustível para 10 km = " + quantidadeCombustivel10);
		System.out.println("quantidade de combustível para 15 km = " + quantidadeCombustivel15);

	}

}
