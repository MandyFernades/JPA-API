package br.com.fiap.revisao.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Atividade {

	//Atributos
	//Define o tipo de atividade (Login, Logout e etc..)
	private TipoAtividade tipo;
	
	//Define a data e hora que o evento ocorreu
	private LocalDateTime data;
	
	//Construtor
	public Atividade(TipoAtividade tipo, LocalDateTime data) {
		this.tipo = tipo;
		this.data = data;
	}
	
	@Override
	public String toString() {
		//Formatador de data e hora com o padrão: dia/mes/ano hora:minutos:segundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		return "Tipo: " + tipo + " Data: " + data.format(formatador);
	}

	//Getters e Setters
	public TipoAtividade getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtividade tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}