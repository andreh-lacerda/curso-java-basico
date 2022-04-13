package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo para download em MB? ");
		double arquivoMb = scan.nextDouble();
		System.out.println("Qual a velocidade do link de internet em Mbps? ");
		double velocidadeMbps = scan.nextDouble();
		double tempoDownload = arquivoMb / velocidadeMbps;
		System.out.println("O tempo aproximado para download é de " + tempoDownload + " minutos");
		

	}

}
