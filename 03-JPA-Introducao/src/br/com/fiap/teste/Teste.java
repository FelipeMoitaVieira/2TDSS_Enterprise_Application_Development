package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {

		//Criar o gerenciador de entidades
		
		//Criar a Fábrica de entity manager
		//valor configurado no persistence.xml
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE"); 
		
		EntityManager em = fabrica.createEntityManager();
	}

}
