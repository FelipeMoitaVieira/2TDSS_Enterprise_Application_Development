package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteAtualizacao {

	public static void main(String[] args) {
		//Obter uma instância de EntityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		Funcionario func = em.find(Funcionario.class, 1);
		
		func.setNome("Bruschetta");
		
		em.merge(func);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Funcionário: " + func.getNome());
		System.exit(0);
	}

}