package br.com.fiap.main;

import br.com.fiap.dao.OrmDao;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Pessoa;

public class Exercicio {
	
	public static void main(String[] args) {
		//Instanciar um OrmDao
		OrmDao dao = new OrmDao();
		
		//Instanciar um Aluno
		Aluno aluno = new Aluno();
		
		//Chamar o método pesquisar passando o objeto aluno e exibir o resultado
		System.out.println(dao.pesquisar(aluno));
		
		//Instanciar uma pessoa
		Pessoa pessoa = new Pessoa();
		
		//Chamar o método pesquisar passando o objeto pessoa e exibir o resultado
		System.out.println(dao.pesquisar(pessoa));
		
	}
}