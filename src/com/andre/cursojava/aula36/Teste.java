package com.andre.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Link");
		
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua 1");
		endereco.setNumero("35");
		endereco.setComplemento("Meio do laguinho");
		endereco.setCidade("Hateno Village");
		endereco.setEstado("Hyrule");
		endereco.setCep("11000-111");
		
		contato.setEndereco(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Fadinha");
		telefone.setDdd("13");
		telefone.setNumero("2345-6789");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Residencial");
		telefone2.setDdd("13");
		telefone2.setNumero("1011-1213");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getTipo() + " " + t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
