package alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		//Set<String> alunos = new HashSet<>();
		// Set não aceita repetição de elementos
		alunos.add("Jose Malcher");
		alunos.add("Rodrigo Tal tal");
		alunos.add("Maria Joaquina");
		alunos.add("Cirilo Miranda");
		alunos.add("Sergio Lopes");
		alunos.add("Mauricio Farofa");
		alunos.add("Sergio Lopes");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("\nTAMANHO = " + alunos.size());
		
		//JAVA 8
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo silveira");
		System.out.println(pauloEstaMatriculado);
		System.out.println("*** REMOVENDO ***");
		alunos.remove("Maria Joaquina");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Collections.sort(alunos);
		//não existe para alunos, pois so aceita lista(sort). Não sequencia.
		
		//alunos.get(6) somente em List
		List<String> alunosEmLista = new ArrayList<>(alunos);
		//agora é possível ordenar e trabalhar com a lista
		Collections.sort(alunosEmLista);
		
	}
}
