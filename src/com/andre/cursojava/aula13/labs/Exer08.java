package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Quanto você ganha por hora e quantas horas trabalha por mês ?");
		float valorHora = Float.parseFloat(scan.next());
		float horasTrabalhadaMes = Float.parseFloat(scan.next());
		float salarioMes = valorHora * horasTrabalhadaMes;
		System.out.println("Seu salário mensal é R$ " + salarioMes);

	}

}
