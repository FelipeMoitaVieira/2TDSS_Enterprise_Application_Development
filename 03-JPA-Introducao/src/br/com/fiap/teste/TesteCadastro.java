package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Sexo;

public class TesteCadastro {

	public static void main(String[] args) {

		//Cadastrar um funcionário
		
		//Instanciar a classe Funcionário
		Funcionario func = new Funcionario("Jesuino",new GregorianCalendar(1988,Calendar.AUGUST,21),Calendar.getInstance(),0,null,Sexo.MASCULINO);
		
		//Obter uma instância de EntityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Chamar o método do entitymanager para persistir o funcionário
		
		 em.persist(func);
		
		//Iniciar e finalizar uma transação
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		//Sucesso!!
		System.out.println("Funcionário Cadastrado!!");
		System.exit(0);
		
	}

}
