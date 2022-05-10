package com.andre.cursojava.aula29;

public class Carro {

	private String marca;
	private String modelo;
	private int numeroPassageiros;
	private double capacidadeCombustivel;
	private double consumoCombustivel;
	
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() { }

	public void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km");
	}

	public double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capacidadeCombustivel * consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km / consumoCombustivel;
	}

	public double calcularCombustivel(double km) {

		return this.divideKmPorConsumoCombustivel(km);
	}

}
