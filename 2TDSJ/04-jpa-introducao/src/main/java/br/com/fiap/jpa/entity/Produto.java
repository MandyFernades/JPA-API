package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_PRODUTO")
//name -> nome no Java, utilizado no generator, sequenceName -> nome no Banco, incremento
@SequenceGenerator(name="produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

	@Id
	@Column(name="cd_produto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	private Integer codigo;
	
	@Column(name="nm_produto", nullable = false, length = 60) //nullable -> pode ser nulo?
	private String nome;

	@Column(name="qt_produto")
	private Integer quantidade;
	
	@Column(name="vl_produto", precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE) //Define o que será gravado no banco (somente a data)
	@Column(name="dt_cadastro", nullable = false, updatable = false) //updatable -> pode ser atualizado?
	private Calendar dataCadastro;
	
	@Column(name="st_disponivel", nullable = false)
	private Boolean disponivel;
	
	@Transient //Não será uma coluna no banco
	private Integer quantidadeFornecedores;
	
	@Column(name="dt_validade")
	private LocalDate dataValidade;
	
	@Lob //Define um campo do tipo BLOB no oracle, para armazenar aquivos
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING) //Grava o texto da constante e não a posição
	@Column(name="ds_tipo", length = 20)
	private Tipo tipo;

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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Integer getQuantidadeFornecedores() {
		return quantidadeFornecedores;
	}

	public void setQuantidadeFornecedores(Integer quantidadeFornecedores) {
		this.quantidadeFornecedores = quantidadeFornecedores;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}