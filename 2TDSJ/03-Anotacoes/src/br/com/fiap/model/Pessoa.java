package br.com.fiap.model;

import java.time.LocalDate;
import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TB_PESSOA")
public class Pessoa {

	@Coluna(chave = true, nome="cd_pessoa")
	private int codigo;
	
	@Coluna(nome="nm_pessoa", tamanho = 80)
	private String nome;
	
	@Coluna(nome="dt_nascimento") 
	private LocalDate dataNascimento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}