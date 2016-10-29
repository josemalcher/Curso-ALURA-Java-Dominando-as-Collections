package alura;

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

	}

}
