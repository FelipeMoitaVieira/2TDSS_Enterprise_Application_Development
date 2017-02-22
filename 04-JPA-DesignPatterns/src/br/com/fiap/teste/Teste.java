package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		TimeDAO dao = new TimeDAOImpl(em);
		
		//Cadastrar um time
		Time corinthians = new Time(0,"Corinthians","Arena Corinthians",
				new GregorianCalendar(1910,Calendar.SEPTEMBER,1),null);
		
		dao.insert(corinthians);
		
		em.close();
		System.exit(0);
		
	}
	
	

}
