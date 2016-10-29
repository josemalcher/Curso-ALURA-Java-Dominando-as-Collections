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
			throw new NoSuchElementException("Matricula não Encontrada "+ numeroMatricula);*/
		//return matriculaParaAluno.get(numeroMatricula);
		if(!matriculaParaAluno.containsKey(numeroMatricula)){
			throw new NoSuchElementException();
		}
		return matriculaParaAluno.get(numeroMatricula);
	}

}
