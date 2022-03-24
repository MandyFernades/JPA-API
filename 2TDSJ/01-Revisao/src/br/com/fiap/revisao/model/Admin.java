package br.com.fiap.revisao.model;

//Herança:
//Object <- Usuario <- Admin

//Quando é herança ou atributo?
// É UM? -> Herança
// TEM UM? -> Atributo/Associação
public class Admin extends Usuario {

	//Atributos
	private String email;
	
	private Endereco endereco;
	
	//Construtores são herdados? Não!
	//O construtor da classe filha precisa chamar um construtor do pai
	public Admin(long id, String nome) {
		super(id,nome);//chama o construtor do pai
	}
	
	//Construtor com todos os atributos
	public Admin(long id, String nome, String cpf, int idade, String email) {
		super(id, nome, cpf, idade);
		this.email = email;
	}

	//Métodos
	
	@Override
	public String toString() {
		return super.toString() + " E-mail: " + email;
	}
	
	//Sobrescrita (Override) -> mesmo método do pai na classe filha
	public boolean permissao() {
		return idade > 21;
	}
	
	public boolean validarEmail() {
		//Verifica se o e-mail contém um "@"
		return email.contains("@");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}