package br.com.fiap.bean;

import java.util.Calendar;
import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	//Atributo
	private TipoConta tipo;
	
	//Construtores
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura,
												double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	//Métodos
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se a conta é comum e o saldo fica negativo depois do saque
		if (tipo == TipoConta.COMUM && valor > saldo) {
			//Lançar uma exception
			//Exception -> checked: validadas em tempo de compilação, devem ser tratadas pelo dev
			//RuntimeException -> unchecked: não obriga o dev a tratar
			throw new SaldoInsuficienteException("Saldo insuficiente, valor disponível " + saldo);
		}
		saldo -= valor;
	}

//	@Override CTRL + /
//	public void depositar(double valor) {
//		saldo += valor; //saldo = saldo + valor;
//	}

	//Getters e Setters
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
}