package br.com.rodrigo.alura.capitulo6.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copaDoMundo = LocalDate.of(2018, Month.JUNE, 10);
		
		int anos = copaDoMundo.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, copaDoMundo);
		System.out.println(periodo);
		
		LocalDate proximaCopaDoMundo = copaDoMundo.plusYears(4);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String proximaCopaDoMundoFormatada = proximaCopaDoMundo.format(formatador);
		
		System.out.println(proximaCopaDoMundo);
		System.out.println(proximaCopaDoMundoFormatada);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}

}
