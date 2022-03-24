package br.com.fiap.revisao.model;

import java.util.List;

public class Usuario {

	//Modificadores de acesso:
	//private -> somente a própria classe
	//default/package -> a classe e classes do mesmo pacote
	//protected -> a classe, classes filhas e classes do mesmo pacote
	//public -> todas as classes
	
	//Valores padrões -> números -> 0, Referência -> null, boolean -> false
	//Atributos
	private long id;
	private String nome;
	private String cpf;
	protected int idade;
	
	//Define a lista de atividades realizadas pelo usuário
	private List<Atividade> atividades;
	
	//Construtores -> Método especial utilizado na instanciação da classe
	//1- não tem retorno, nem void
	//2- tem o mesmo nome da classe
	public Usuario(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Usuario(long id, String nome, String cpf, int idade) {
		this(id, nome); //chamar o construtor da linha 26
		this.cpf = cpf;
		this.idade = idade;
	}
	
	//Criar um construtor com todos os atributos
	public Usuario(long id, String nome, String cpf, int idade, List<Atividade> atividades) {
		this(id, nome, cpf, idade);
		this.atividades = atividades;
	}
	
	//Métodos
	//Sobrescrenvendo o método toString() para exibir os dados do objeto
	@Override
	public String toString() {
		return "Id: " + id + " Nome: " + nome + " Cpf: " + cpf + " Idade: " + idade; 
	}
	
	//Sobrecarga (Overload) -> método com o mesmo nome, mas com parâmetros diferentes
	//diferentes -> no tipo ou na quantidade
	public void logar(int token) {
		System.out.println("Usuário logando com token");
	}
	
	public void logar(String senha) {
		System.out.println("Usuário logando");
	}
	
	public boolean permissao() {
		//Se tiver mais de 16 anos -> true, se não -> false
		//(Ternário) condição ? se verdadeiro : se falso
		//return idade > 16 ? true s: false;
		return idade > 16;
	}
	
	//Getters e Setters 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
}