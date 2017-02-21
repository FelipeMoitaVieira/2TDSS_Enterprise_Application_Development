package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.entity.Sexo;

public class Teste {

	public static void main(String[] args) {

		Editora editora = new Editora(0,"123456789","Atlas","Av. Paulista");
		Livro livro = new Livro(0,"50 tons de Preto",87,new GregorianCalendar(2001,Calendar.AUGUST,12),null);
		Autor autor = new Autor(0,"Jesuíno",Sexo.MASCULINO,"Fonseca",new GregorianCalendar(1970,Calendar.SEPTEMBER,04));
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		em.persist(editora);
		em.persist(livro);
		em.persist(autor);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Livro, Autor e Editora cadastrados com sucesso!!");
		System.exit(0);
		
	}

}
