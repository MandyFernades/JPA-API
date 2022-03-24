package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Usuario;

public class UsuarioMySqlDao implements UsuarioDao {

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Cadastrando no MySql..");
	}

	@Override
	public List<Usuario> listar() {
		System.out.println("Listando do MySql..");
		return null;
	}

}