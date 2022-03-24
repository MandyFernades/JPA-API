package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(1, 123, 
				new GregorianCalendar(2010, Calendar.JULY, 10), 0, TipoConta.COMUM);
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(2, 321, Calendar.getInstance(), 0, 2);
		
		//Chamar o método de depositar
		cc.depositar(100);
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		
		cp.depositar(100);
		System.out.println("Saldo da conta poupança: " + cp.getSaldo());
		
		//Chamar o método de retirar
		try {
			cc.retirar(1000);
			System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}	
		try {
			cp.retirar(100);
			System.out.println("Saldo da conta poupança: " + cp.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de Conta Corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(1,32, 
				new GregorianCalendar(2000, Calendar.JANUARY, 19), 10, TipoConta.ESPECIAL));
		lista.add(new ContaCorrente(12,32, 
				new GregorianCalendar(1999, Calendar.AUGUST, 7), 989, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas
		System.out.println("Saldo das contas:");
		for (ContaCorrente item : lista) {
			System.out.println(item.getSaldo());
		}
		
	}//main
}//class