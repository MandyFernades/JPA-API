package br.com.fiap.dao;

import br.com.fiap.anotacao.Tabela;

public class OrmDao {
	
	//1- Criar a anotação @Tabela com o parâmetro nome
	//2- Criar a classe Aluno (sem atributos) com a anotação @Tabela
	//3- Implementar o método pesquisar
	//4- Criar uma classe com o método main para instanciar um aluno e 
	//o ormDao para chamar o método pesquisar e exibir o resultado

	/**
	 * Recebe o objeto para retornar o SQL de pesquisa adequado
	 * @param objeto
	 * @return o select na tabela configurada na anotação @Tabela
	 */
	public String pesquisar(Object objeto) {
		//Recuperar o @Tabela do objeto
		Tabela anotacao =  objeto.getClass().getAnnotation(Tabela.class);
		//Concatenar o comando SQL com o parâmetro nome da @Tabela
		return "SELECT * FROM " + anotacao.nome();
	}
	
}