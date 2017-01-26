package br.com.rodrigo.alura.capitulo1.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		//Collections.sort(palavras, comparador); // old style
		
		palavras.sort(comparador); // new style
		
		System.out.println(palavras);
		
		for (String p : palavras) {
			System.out.println(p);
		}
		
		Consumer<String> imprimeNaLinha = new ImprimeNaLinha();
		palavras.forEach(imprimeNaLinha);
		
		palavras.forEach(palavra -> System.out.println(palavra));
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
}
