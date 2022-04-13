package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora e quantas horas trabalha por mês ?");
		float valorHora = Float.parseFloat(scan.next());
		float horasTrabalhadaMes = Float.parseFloat(scan.next());
		float salarioMes = valorHora * horasTrabalhadaMes;
		float descontoIR = salarioMes * 0.11f;
		float descontoINSS = salarioMes * 0.08f;
		float descontoSindicato = salarioMes * 0.05f;
		float descontosTotais = descontoINSS + descontoIR + descontoSindicato;
		float salarioLiquido = salarioMes - descontosTotais;
		System.out.println("Seu salário bruto mensal é R$ " + salarioMes);
		System.out.println("Você pagou de IR R$ " + descontoIR);
		System.out.println("Você pagou de INSS R$ " + descontoINSS);
		System.out.println("Você pagou de Sindicato R$ " + descontoSindicato);
		System.out.println("Seu salário líquido é R$ " + salarioLiquido);

	}

}
