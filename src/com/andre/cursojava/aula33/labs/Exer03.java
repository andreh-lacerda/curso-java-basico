package com.andre.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		aluno.setNome(scan.next());
		
		System.out.println("Informe o nome do curso");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Informe a matr�cula");
		aluno.setMatricula(scan.next());
		
		for ( int i = 0; i < aluno.getNomeDisciplinas().length; i++ ) {
			System.out.println("Informe o nome da disciplina " + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for ( int i = 0; i < aluno.getNotasDisciplinas().length; i++ ) {
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for ( int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Informe a nota " + (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		
		for ( int i = 0; i < aluno.getNomeDisciplinas().length; i++ ) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi reprovado");
			}
		}

		

	}

}
