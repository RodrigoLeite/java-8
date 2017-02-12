package br.com.rodrigo.alura.capitulo4.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCursos2 {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Curso 1", 10));
		cursos.add(new Curso("Curso 2", 20));
		cursos.add(new Curso("Curso 3", 30));
		
		cursos.sort(Comparator.comparing(c -> c.getNome()));
		cursos.sort(Comparator.comparing(Curso::getNome));
		
		List<Curso> outrosCursos = cursos.stream().filter(c -> c.getAlunos() > 15).collect(Collectors.toList());
		
		List<Integer> alunos = cursos.stream().filter(c -> c.getAlunos() > 10).map(c -> c.getAlunos()).collect(Collectors.toList());
		
		cursos.stream().filter(c -> c.getAlunos() > 10).forEach(System.out::println);
		
	}

}
