package alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "COnhecendo mais de listas";
		String aula2 = "Modelnado a class Aula";
		String aula3 = "CTrabalhando com cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println(aula);
		}
		System.out.println("****");
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula agora é: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aulas: " + aulas.get(i));
		}

		System.out.println(aulas.size());
		
		//Java 8 
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		
		//Collections 
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("** ORDENADO **");
		System.out.println(aulas);
		
		
		
	}

}
