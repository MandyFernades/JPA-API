package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Usuario;

public class UsuarioOracleDao implements UsuarioDao {

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Cadastrando no Oracle..");
	}

	@Override
	public List<Usuario> listar() {
		System.out.println("Listando do Oracle..");
		return null;
	}

}