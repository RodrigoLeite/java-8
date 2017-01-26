package br.com.rodrigo.alura.capitulo3.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		palavras.forEach(palavra -> System.out.println(palavra));
		
		palavras.forEach(System.out::println);
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
 	}
}
