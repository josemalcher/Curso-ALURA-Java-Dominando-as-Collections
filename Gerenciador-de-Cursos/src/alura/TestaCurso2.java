package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		/*
		 * List<Aula> aulas = javaColecoes.getAulas();
		 * System.out.println(aulas);
		 * 

		 */
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		 Collections.sort(aulas); 
		 System.out.println(aulas);
		 
		 System.out.println("Tempo total: "+javaColecoes.getTempoTotal());
		 System.out.println("toString com Cursos: ");
		 System.out.println(javaColecoes);
	}

}
