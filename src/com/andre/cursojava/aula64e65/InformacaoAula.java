package com.andre.cursojava.aula64e65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://exemplo";
	
	String site() default "http://exemplo2";

}
