package alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Jose Malcher", 12345);
		Aluno a2 = new Aluno("Maria Acildes", 02222);
		Aluno a3 = new Aluno("Luciana Souza", 44444);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("**Alunos Matriculados**");
		javaColecoes.getAlunos().forEach( a -> {
			System.out.println(a );
		});
		
		
		System.out.println("O Aluno "+ a1 + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("** Equals e HashCode**");
		//equals
		Aluno joseMalcher = new Aluno("Jose Malcher", 12345);
		//String nome = "Jose Malcher";
		System.out.println(javaColecoes.estaMatriculado(joseMalcher));
		//hashCode -> tabela de espalhamento
		
		System.out.println("O a1 ==(equals) ao Jose Malcher?");
		System.out.println(a1.equals(joseMalcher));
		
		System.out.println("*** AULA 8 ****");
		for (Aluno aluno : javaColecoes.getAlunos()) {
			System.out.println(aluno);
		}
		System.out.println();

		//Iterator 
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		iterador.hasNext();//h� algum ooutro elemento?
		while(iterador.hasNext()){
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		//� necess�rio criar um novo interator
		//Aluno depoisDoUltimo = iterador.next();
		
		//Vector<Aluno> vetor = new Vector<>(); //muito antiga(n�o recomendado), usa varias threads
	}

}
