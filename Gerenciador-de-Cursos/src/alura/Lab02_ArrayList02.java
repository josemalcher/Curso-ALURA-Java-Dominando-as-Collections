package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab02_ArrayList02 {
public static void main(String[] args) {
		
		Aula2 a1 = new Aula2("Revistando as ArrayLists", 21);
		Aula2 a2 = new Aula2("Listas de objetos", 20);
		Aula2 a3 = new Aula2("Relacionamento de listas e objetos", 15);

		ArrayList<Aula2> aulas = new ArrayList<Aula2>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Ordanção pelo Java8
		aulas.sort(Comparator.comparing(Aula2::getTempo));
		System.out.println(aulas);
	}

}


