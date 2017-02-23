package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//Atributo est�tico
	private static EntityManagerFactory fabrica;
	
	//Construtor privado
	private EntityManagerFactorySingleton(){}
	
	//M�todo est�tico que instancia o EntityManagerFactory
	public static EntityManagerFactory getInstance(){
		if(fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
	
	
}
