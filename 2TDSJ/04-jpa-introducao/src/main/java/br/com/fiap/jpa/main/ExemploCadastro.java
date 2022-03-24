package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Genero;

public class ExemploCadastro {

	public static void main(String[] args) {
		//Obter um entity manager factory (fabrica)
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
//		byte[] vetor = new byte[10];
//		vetor[0] = 1;
		
		//Criar um objeto Cliente, sem c�digo (estado novo)
		Cliente cliente = new Cliente("Feij�o", new GregorianCalendar(1975, Calendar.APRIL, 9), 
				Genero.MASCULINO, null, "691.252.345-18", "(11)66856431");
		
		//Chamar o m�todo persist
		em.persist(cliente);
		
		//Iniciar uma transa��o
		em.getTransaction().begin();
		
		//Finalizar a transa��o com o commit
		em.getTransaction().commit();
		
		//Alterar o nome
		cliente.setNome("Jo�o");
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
}