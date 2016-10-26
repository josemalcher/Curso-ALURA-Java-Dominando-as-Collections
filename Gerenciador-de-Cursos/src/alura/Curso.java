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
		 * Queremos que ele s� fa�a da primeira forma, usando nosso novo m�todo
		 * adiciona. Como for�ar isso? N�o h� como for�ar, mas h� como programar
		 * defensivamente, fazendo com que o m�todo getAulas devolva uma c�pia
		 * da cole��o de aulas. Melhor ainda: podemos devolver essa c�pia de tal
		 * forma que ela n�o possa ser alterada, ou seja, que ela seja n�o
		 * modific�vel, usando o m�todo Collections.unmodifiableList:
		 * 
		 * Uma exception ser� lan�ada ao tentarmos executar
		 * javaColecoes.getAulas().add. Qualquer tentativa de modifica��o vai
		 * lan�ar essa exception, indicando algo como
		 * "opa! voc� n�o pode alterar o estado dessa cole��o aqui, encontre outra forma de fazer o que voc� quer"
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
