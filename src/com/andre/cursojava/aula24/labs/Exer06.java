package com.andre.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Link";
		contato1.endereco = "Kakariko Village";
		contato1.email = "link@hyrulemail.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "234-5678";
		contato1.telefones[1] = "910-1112";
		contato1.telefones[2] = "131-4151";
		
		System.out.println("Contato 1");
		System.out.println("Nome: " + contato1.nome);
		System.out.println("Endereço: " + contato1.endereco);
		System.out.println("E-mail: " + contato1.email);
		System.out.println("Telefones: " + contato1.telefones[0]);
	}

}
