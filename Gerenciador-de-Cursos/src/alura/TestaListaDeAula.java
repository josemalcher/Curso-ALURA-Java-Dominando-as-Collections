package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando ArrayList", 35);
		Aula a2 = new Aula("Lista de Objetos", 22);
		Aula a3 = new Aula("Relacionamento", 10);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		System.out.println("** Comparando pelo título **");
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		
		System.out.println("** Comparando pelo tempo **");
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//Mesmo Efeito do código acima
		//aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
