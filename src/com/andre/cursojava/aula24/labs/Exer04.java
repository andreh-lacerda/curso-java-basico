package com.andre.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Zeldinha";
		livro.autor = "Nintendo";
		livro.anoLancamento = 2022;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoParaPessoa = "André";
		
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println("Livro emprestado ? = " + livro.emprestado);
		System.out.println("Emprestado para = " + livro.emprestadoParaPessoa);
		System.out.println("Data da entrega = " + livro.dataEntrega);
		


	}

}
