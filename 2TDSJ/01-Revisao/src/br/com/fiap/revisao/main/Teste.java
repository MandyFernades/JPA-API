package br.com.fiap.revisao.main;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.revisao.model.Admin;
import br.com.fiap.revisao.model.Atividade;
import br.com.fiap.revisao.model.TipoAtividade;
import br.com.fiap.revisao.model.Usuario;

public class Teste {

	//Criar o método main // main -> CTRL + Espaço
	public static void main(String[] args) {
		//Instanciar um Usuario
		Usuario user = new Usuario(1, "Vitoria", "22.543.643-49", 20 );
		
//		//Setar os valores para os atributos
//		user.setCpf("22.543.643-49");
//		user.setId(1);
//		user.setNome("Vitoria");
//		user.setIdade(14);
		
		//Chamar os métodos
		user.logar("123");
		System.out.println("Permissão: " + user.permissao());
		
		//Exibir os valores do objeto armazenado em user
		System.out.println(user);
		
		//Instanciar um Admin
		Admin adm = new Admin(2, "Victor", "32.343.643-59", 20, "victor@fiap.com.br" );
		adm.logar("123");
		System.out.println("Permissão admin: " + adm.permissao());
		
		//Exibir os valores do admin, Exibir o email do admin
		System.out.println(adm);
		
		//Admin adm2 = new Usuario(3,""); Não compila
		
		Usuario user2 = new Admin(3, "", "", 20, "");
		System.out.println("Permissão admin: " + user2.permissao()); //Admin
		
		//Criar uma lista de atividades
		List<Atividade> lista = new ArrayList<>();
		
		//Adicionar atividades na lista (2 ou 3)
		lista.add(new Atividade(TipoAtividade.LOGIN, LocalDateTime.now()));
		lista.add(new Atividade(TipoAtividade.LOGOUT, LocalDateTime.of(2022, Month.FEBRUARY, 13, 10, 9, 8)));
		lista.add(new Atividade(TipoAtividade.UPDATE_PROFILE, LocalDateTime.of(2022,  1, 15, 16, 9, 9)));
		
		//Instanciar um Usuário com todos os atributos 
		Usuario usuario = new Usuario(5, "Kleber", "23.435.235-92", 20, lista);
		
		//Exibir os dados do usuário
		System.out.println(usuario);
		
		//Exibir as atividades do usuário
		for (Atividade item : usuario.getAtividades()) {
			System.out.println(item);
		}
		
	}//main
}//class