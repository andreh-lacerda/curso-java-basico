package com.andre.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Zeldinha";
		livro.autor = "Nintendo";
		livro.anoLancamento = 2022;
		livro.preco = 20.15;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println("Nome do autor = " + livro.preco);

	}

}
