package com.andre.cursojava.aula56;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumeroteste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroteste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroteste();

}
