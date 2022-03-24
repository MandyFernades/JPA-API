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
		
		//Criar um objeto Cliente, sem código (estado novo)
		Cliente cliente = new Cliente("Feijão", new GregorianCalendar(1975, Calendar.APRIL, 9), 
				Genero.MASCULINO, null, "691.252.345-18", "(11)66856431");
		
		//Chamar o método persist
		em.persist(cliente);
		
		//Iniciar uma transação
		em.getTransaction().begin();
		
		//Finalizar a transação com o commit
		em.getTransaction().commit();
		
		//Alterar o nome
		cliente.setNome("João");
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
}