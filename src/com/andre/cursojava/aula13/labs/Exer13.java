package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora e quantas horas trabalha por m�s ?");
		float valorHora = Float.parseFloat(scan.next());
		float horasTrabalhadaMes = Float.parseFloat(scan.next());
		float salarioMes = valorHora * horasTrabalhadaMes;
		float descontoIR = salarioMes * 0.11f;
		float descontoINSS = salarioMes * 0.08f;
		float descontoSindicato = salarioMes * 0.05f;
		float descontosTotais = descontoINSS + descontoIR + descontoSindicato;
		float salarioLiquido = salarioMes - descontosTotais;
		System.out.println("Seu sal�rio bruto mensal � R$ " + salarioMes);
		System.out.println("Voc� pagou de IR R$ " + descontoIR);
		System.out.println("Voc� pagou de INSS R$ " + descontoINSS);
		System.out.println("Voc� pagou de Sindicato R$ " + descontoSindicato);
		System.out.println("Seu sal�rio l�quido � R$ " + salarioLiquido);

	}

}
