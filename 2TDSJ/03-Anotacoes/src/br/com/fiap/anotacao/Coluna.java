package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Código Java --Compila--> Bytecode (.class) --Interpreta JVM--> Execução

//Retention -> define até quando a anotação será mantida (Codigo, Bytecode, Execução)
@Retention(RetentionPolicy.RUNTIME) //mantém até a execução

//Target -> define em quais elementos da classe a anotação pode ser utilizada
@Target({ ElementType.FIELD, ElementType.METHOD }) //Atributos e métodos
public @interface Coluna {
	String nome();
	boolean chave() default false;
	int tamanho() default 0; //valor padrão, o parâmetro não é obrigatório
}