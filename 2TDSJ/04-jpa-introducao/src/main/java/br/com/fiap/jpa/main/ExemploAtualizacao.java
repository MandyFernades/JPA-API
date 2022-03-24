package br.com.fiap.jpa.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Genero;

public class ExemploAtualizacao {

	public static void main(String[] args) {
		//Obter a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um cliente detached (com código válido no banco)
		Cliente cliente = new Cliente(1, "Julia", 
			new GregorianCalendar(2000, Calendar.JANUARY, 15), Genero.FEMININO, null,
			"456.654.654-88", "(13)78954221");
		
		//Chamar o método merge
		Cliente copia = em.merge(cliente); //Retorna a cópia do objeto gerenciado
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Alterar o nome do cliente
		copia.setNome("Teste");
		
		//Begin e Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
}
