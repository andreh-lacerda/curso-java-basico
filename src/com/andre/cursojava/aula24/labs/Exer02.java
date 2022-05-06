package com.andre.cursojava.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Zeldinha";
		livro.autor = "Nintendo";
		livro.anoLancamento = 2022;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);

	}

}
