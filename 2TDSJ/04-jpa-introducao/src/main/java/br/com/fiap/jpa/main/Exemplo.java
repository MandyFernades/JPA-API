package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {
	
	public static void main(String[] args) {
		
		//Obter uma fabrica de entity manager (Gerenciador de entidades)
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		fabrica.close();
	}

}