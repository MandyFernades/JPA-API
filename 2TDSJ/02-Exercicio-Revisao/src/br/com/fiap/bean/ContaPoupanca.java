package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	//Atributo
	private float taxa;
	
	//Constante
	//final -> não permite alterar o valor
	//static -> define que o elemento é da classe e não do objeto
	public static final float RENDIMENTO = 0.06f; 
	
	//Construtores CTRL + 3 -> gcuf
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}

	@Override 
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Verificar se o saldo é suficiente junto da taxa de retirada
		if (saldo < valor + taxa) {
			throw new SaldoInsuficienteException("Saldo insuficiente, valor disponível: " + (saldo - taxa));
		}
		saldo -= valor + taxa;
	}

//	@Override
//	public void depositar(double valor) {
//		saldo += valor; //saldo = saldo + valor;
//	}

	//Getters e Setters
	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}