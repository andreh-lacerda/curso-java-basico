package com.andre.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		for (int i =0; i < 3; i++) {
			System.out.println("Digite as informações do contato " + (i+1));
			Contato contato = new Contato();
			
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();
			contato.setNome(nome);
			
			System.out.println("Digite o telefone: ");
			String telefone = scan.nextLine();
			contato.setTelefone(telefone);
			
			System.out.println("Digite o e-mail: ");
			String email = scan.nextLine();
			contato.setEmail(email);
			
			contatos[i] = contato;
			
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
