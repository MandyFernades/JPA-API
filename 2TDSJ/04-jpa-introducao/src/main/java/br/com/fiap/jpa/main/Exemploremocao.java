package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;

public class Exemploremocao {
	public static void main(String[] args) {
		//Obter a fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//obter o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		
		//Procurar o cliente
		Cliente cliente = em.find(Cliente.class, 1);
		
		
		//Chamar o método remove
		em.remove(cliente);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
				
		//Fechar
		em.close();
		fabrica.close();
	}
}