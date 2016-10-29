package alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;

	private List<Aula> aulas = new LinkedList<Aula>();
	
	private Set<Aluno> alunos = new HashSet<>();
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	//private Set<Aluno> alunos = new TreeSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal() + ", aulas: + " + this.aulas
				+ "]";
	}

	public void matricula(Aluno aluno) {	
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
			/*for(Aluno aluno : alunos){
				if(aluno.getNumeroMatricula()== numeroMatricula){
					return aluno;
				}
			}
			throw new NoSuchElementException("Matricula n�o Encontrada "+ numeroMatricula);*/
		//return matriculaParaAluno.get(numeroMatricula);
		if(!matriculaParaAluno.containsKey(numeroMatricula)){
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(numeroMatricula);
	}

}
