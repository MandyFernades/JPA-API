package br.com.fiap.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;

public class ExemploRefresh {
	
	public static void main(String[] args) {
		//Obter a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Obter o entity manager
		EntityManager em = fabrica.createEntityManager();

		//Pesquisar o cliente pelo código
		Cliente cliente = em.find(Cliente.class, 1); //Classe, PK
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Alterar o nome do cliente no objeto
		cliente.setNome("Amanda");
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		
		//Chamar o método refresh
		em.refresh(cliente);
		
		//Exibir o nome do cliente
		System.out.println(cliente.getNome());
		
		//Fechar
		em.close();
		fabrica.close();
	}
}