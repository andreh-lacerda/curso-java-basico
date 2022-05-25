package com.andre.cursojava.aula64e65;

public class ColetorLixo {
	
	public static void ObterMemoriaUsada() {
		
		final int MB =1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
		
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[1000000];
		Contato contato;
		
		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		ObterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		
		ObterMemoriaUsada();

	}

}
