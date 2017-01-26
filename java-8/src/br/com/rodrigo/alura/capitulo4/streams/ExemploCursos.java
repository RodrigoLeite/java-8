package br.com.rodrigo.alura.capitulo4.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
	
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}


public class ExemploCursos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(System.out::println);
		
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		
		System.out.println(sum);
	}

}
