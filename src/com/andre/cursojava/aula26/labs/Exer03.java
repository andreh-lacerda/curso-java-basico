package com.andre.cursojava.aula26.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		aluno.nome = scan.next();
		
		System.out.println("Informe o nome do curso");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Informe a matrícula");
		aluno.matricula = scan.next();
		
		aluno.nomeDisciplinas = new String[3];
		for ( int i = 0; i < aluno.nomeDisciplinas.length; i++ ) {
			System.out.println("Informe o nome da disciplina " + i);
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		aluno.notasDisciplinas = new double[3][4];
		for ( int i = 0; i < aluno.notasDisciplinas.length; i++ ) {
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for ( int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a nota " + (j+1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
		for ( int i = 0; i < aluno.nomeDisciplinas.length; i++ ) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
			}
		}

	}

}
