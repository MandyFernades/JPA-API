package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Usuario;

//Interface -> define um contrato para as classes
//As classes que implementam a interface devem implementar os métodos definidos
//Interface diminiu o acoplamento (dependência) entre os objetos
public interface UsuarioDao {

	void cadastrar(Usuario usuario);
	
	List<Usuario> listar();
	
}