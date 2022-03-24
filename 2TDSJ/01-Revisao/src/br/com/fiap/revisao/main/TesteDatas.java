package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {

	public static void main(String[] args) {
		
		//Instanciar um Calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		
		//Instanciar um Calendar com a data da apresentação da challenge 22/02/2022
								//ano,mes,dia, horas, minutos
		Calendar challenge = new GregorianCalendar(2022, Calendar.FEBRUARY, 22, 11, 0);
		
		//Formatador de data				//Dia/Mês/Ano Horas:Minutos:Segundos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir as datas formatadas
		System.out.println("Hoje: " + sdf.format(hoje.getTime()));
		System.out.println("Challenge: " + sdf.format(challenge.getTime()));
		
		//API de Datas do Java 8
		//Criar uma data de hoje
		LocalDate dataHoje = LocalDate.now();
		//Criar uma data de inicio das aulas 07/02/2022
		LocalDate dataInicioAulas = LocalDate.of(2022, Month.FEBRUARY, 7);
		
		//Criar um horário atual
		LocalTime horaAgora = LocalTime.now();
		//Criar o horário do início do intervalo 09:40
		LocalTime horaIntervalo = LocalTime.of(9, 40);
		
		//Criar uma data e hora atuais
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		//Criar um agendamento da apresentação da challenge 25/05/2022 10:00
		LocalDateTime dataApresentacao = LocalDateTime.of(2022, 5, 25, 10, 0);
		
		//Exibir as datas e horas...
		//Formatador de data
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		System.out.println(dataHoje.format(formataData));
		System.out.println(dataInicioAulas.format(formataData));
		
		//Formatador de horas
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(horaAgora.format(formataHora));
		System.out.println(horaIntervalo.format(formataHora));
		
		//Formatador de data e horas
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(dataHoraAtual.format(formataDataHora));
		System.out.println(dataApresentacao.format(formataDataHora));
		
	}//main
}//class