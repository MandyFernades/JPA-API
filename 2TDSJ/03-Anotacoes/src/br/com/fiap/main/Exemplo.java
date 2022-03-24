package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.model.Pessoa;

public class Exemplo {
	
	public static void main(String[] args) {
		//Instanciar uma Pessoa
		Pessoa pessoa = new Pessoa();
		
		//Exibir o nome da classe
		System.out.println(pessoa.getClass().getName());
		
		//Recuperar os atributos do objeto Pessoa
		Field[] atributos = pessoa.getClass().getDeclaredFields();
		System.out.println("Atributos:");
		//Percorrer o vetor de atributos e exibir o nome e o tipo do atributo
		for (Field item : atributos) {
			System.out.println(item.getName() + " - " + item.getType());
			//Recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			//Exibir o nome da coluna, se é chave e o tamanho
			System.out.println("Nome da coluna: " + anotacao.nome());
			System.out.println("Chave primária? " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho() + "\n");
		}
		
		//Recuperar os métodos declarados na Pessoa
		Method[] metodos = pessoa.getClass().getDeclaredMethods();
		System.out.println("Métodos:");
		//Percorrer o vetor de método e exibir o nome
		for (Method item : metodos) {
			System.out.println(item.getName());
		}
		
	}//main
}//class