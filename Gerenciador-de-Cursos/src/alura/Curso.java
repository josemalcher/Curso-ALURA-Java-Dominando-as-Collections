package alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;

	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		/*
		 * Queremos que ele só faça da primeira forma, usando nosso novo método
		 * adiciona. Como forçar isso? Não há como forçar, mas há como programar
		 * defensivamente, fazendo com que o método getAulas devolva uma cópia
		 * da coleção de aulas. Melhor ainda: podemos devolver essa cópia de tal
		 * forma que ela não possa ser alterada, ou seja, que ela seja não
		 * modificável, usando o método Collections.unmodifiableList:
		 * 
		 * Uma exception será lançada ao tentarmos executar
		 * javaColecoes.getAulas().add. Qualquer tentativa de modificação vai
		 * lançar essa exception, indicando algo como
		 * "opa! você não pode alterar o estado dessa coleção aqui, encontre outra forma de fazer o que você quer"
		 * .
		 * 
		 */

		return Collections.unmodifiableList(aulas);

	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

}
