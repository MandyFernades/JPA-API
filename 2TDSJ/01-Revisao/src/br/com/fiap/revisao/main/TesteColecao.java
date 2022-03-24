package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Usuario;

public class TesteColecao {

	public static void main(String[] args) {
		
		//Criar uma lista de Usuario
		List<Usuario> lista = new ArrayList<>();
		
		//Instanciar e adicionar o usuário na lista
		Usuario user1 = new Usuario(1, "João");
		lista.add(user1);
		lista.add(user1); //adicionando um elemento repetido na lista

		//Instanciar o usuário e adicionar na lista
		lista.add(new Usuario(2, "Victor"));
		
		System.out.println("FOREACH");
		//Exibir os usuários da lista
		for (Usuario item : lista) {
			System.out.println(item);
		}

		System.out.println("FOR");
		//Quantidade de elementos da lista -> .size();
		for (int i=0; i < lista.size(); i++ ) {
			//Recupera o elemento da lista através do index
			System.out.println(lista.get(i));
		}
		
		//Criar um conjunto de String
		Set<String> conjunto = new HashSet<String>();
		
		//Adicionar 3 estados (duas iguais)
		conjunto.add("Acre");
		conjunto.add("Minas Gerais");
		conjunto.add("Acre"); //Ignorado
		
		//Foreach para exibir os elementos do conjunto (Set)
		System.out.println("Conjunto:");
		for (String item : conjunto) {
			System.out.println(item);
		}
		
		//Criar um mapa de Strings (Chave,Valor)
		Map<String, String> mapa = new HashMap<String,String>();
		
		//Adicionar na chave o estado (Sigla) e no valor a capital (3)
		mapa.put("AC", "Rio Branco");
		mapa.put("MG", "Belo Horizonte");
		mapa.put("AC", "Teste"); //substitui o valor da chave
		
		//Recuperar o valor de uma chave específica
		System.out.println("Valor do mapa pela chave: " + mapa.get("AC"));
		
		//Recuperar todas as chaves definidas no mapa
		Set<String> chaves = mapa.keySet();
		
		//Exibir todas as chaves e valores do mapa
		System.out.println("Todos os valores do mapa");
		for (String chave : chaves) {
			System.out.println(chave + " - " + mapa.get(chave));
		}
		
	}//main
}//class
