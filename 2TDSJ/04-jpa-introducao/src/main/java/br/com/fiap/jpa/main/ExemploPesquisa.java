package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;

public class ExemploPesquisa {

	public static void main(String[] args) {
		//Obter a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o cliente por código
		Cliente cliente = em.find(Cliente.class, 2); //Classe, PK
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Alterar o nome do objeto
		cliente.setNome("Danielle");
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
}