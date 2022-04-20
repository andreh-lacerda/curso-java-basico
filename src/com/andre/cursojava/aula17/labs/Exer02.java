package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean senhaValida = false;
		String nomeUsuario;
		String senhaUsuario;
		
		do {
			
			System.out.println("Digite o nome do usuário: ");
			nomeUsuario = scan.next();
			
			System.out.println("Digite a senha: ");
			senhaUsuario = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
				System.out.println("Usuário e senha devem ter nomes diferentes. Insira as informações novamente");
			} else {
				senhaValida = true;
				System.out.println("Usuário e senha ok");
			}
			
		} while (!senhaValida);
		

	}

}
