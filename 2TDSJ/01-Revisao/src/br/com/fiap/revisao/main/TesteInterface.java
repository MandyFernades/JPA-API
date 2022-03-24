package br.com.fiap.revisao.main;

import br.com.fiap.revisao.dao.UsuarioDao;
import br.com.fiap.revisao.dao.UsuarioOracleDao;

public class TesteInterface {
	
	public static void main(String[] args) {
		
		//Declarar uma variável UsuarioDao e instanciar o Objeto
		UsuarioDao dao = new UsuarioOracleDao();
		
		//Chamar o método listar...
		dao.listar();
		
		//Chamar o método cadastrar
		dao.cadastrar(null);
		
	}
}