package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda as perguntas com a letra S para sim ou N para não.");
		
		System.out.println("Telefonou para a vítima ?");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime ?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima ?");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vítima ?");
		String resposta4 = scan.next();
		
		System.out.println("Mora perto da vítima ?");
		String resposta5 = scan.next();
		
		int grauCulpa = 0;
		
		if (resposta1.equalsIgnoreCase("S")) {
			grauCulpa++;
		}
		if (resposta2.equalsIgnoreCase("S")) {
			grauCulpa++;
		}
		if (resposta3.equalsIgnoreCase("S")) {
			grauCulpa++;
		}
		if (resposta4.equalsIgnoreCase("S")) {
			grauCulpa++;
		}
		if (resposta5.equalsIgnoreCase("S")) {
			grauCulpa++;
		}
		
		if (grauCulpa == 2) {
			System.out.println("Pessoa classificada como Suspeita");
		} else if ( grauCulpa == 3 || grauCulpa == 4) {
			System.out.println("Pessoa classificada como Cúmplice");
		} else if ( grauCulpa == 5) {
			System.out.println("Pessoa classificada como Assassino");
		} else {
			System.out.println("Pessoa classificada como Inocente");
		}

	}

}
