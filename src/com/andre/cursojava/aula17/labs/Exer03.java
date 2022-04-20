package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			
			System.out.println("Digite o nome: ");
			nome = scan.next();
			
			if (nome.length() >= 3 ) {
				infoValida = true;
			} else {
				System.out.println("O nome deve ter 3 caracteres ou mais");
			}
		
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A idade deve ter entre 0 e 150 anos");
			}
			
		} while (!infoValida);
			
		infoValida = false;
		
		do {
			
			System.out.println("Digite o salário R$: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salário deve ser maior que 0");
			}
			
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite o sexo (f ou m)");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("O sexo deve ser 'f' ou 'm'");
			}
			
		} while (!infoValida);
			
		infoValida = false;
		
		do {
			
			System.out.println("Digite o estado civil (s = solteiro c = casado v = viuvo d = divorciado)");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || 
				estadoCivil.equalsIgnoreCase("c") ||
				estadoCivil.equalsIgnoreCase("v") ||
				estadoCivil.equalsIgnoreCase("d")) {
					infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'");
			}
			
		}while (!infoValida);
		
		System.out.println("As informações abaixo foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
										
	}

}
