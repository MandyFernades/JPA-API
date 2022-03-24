package br.com.fiap.jpa.entity;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="cliente",sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private Integer codigo;
	
	@Column(name="nm_cliente", nullable = false, length = 80)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@CreationTimestamp //Criar a data automaticamente
	@Column(name="dt_cadastro", nullable = false, updatable = false)
	private LocalDate dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", length = 20, nullable = false)
	private Genero genero;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="nr_cpf", nullable = false, length = 15)
	private String cpf;
	
	@Column(name="nr_telefone", length = 12)
	private String telefone;
	
	@Transient
	private Integer idade;
	
	public Cliente() {}
	
	public Cliente(String nome, Calendar dataNascimento, Genero genero, byte[] foto, 
			String cpf, String telefone) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.foto = foto;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public Cliente(Integer codigo, String nome, Calendar dataNascimento, 
			Genero genero, byte[] foto, String cpf, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.foto = foto;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//Método executado automáticamente 
	@PrePersist//Antes de cadastrar 
	@PostPersist//Depois de cadastrar
	public void executar() {
		System.out.println("Cadastrando o cliente.." + nome);
	}
	
	@PostLoad//Carreagr a idade depois de carregar o objeto do cliente
	public void carregar() {
		//carregar o atributo idade
		idade = 25; //calcular a data de nascimento
		System.out.println("Carregando o objeto cliente..");
		
	}
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}