package br.com.fiap.testes;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Animal;

public class TesteTabela {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Tabela anota = animal.getClass().getAnnotation(Tabela.class);
		
		
		System.out.println("SELECT * FROM " + anota.nome());


	}

}
