package alura;

//import java.util.-List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Curso Dominando COleções","Paulo Silveira" );
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//System.out.println(aulas);
		
		//aulas.add(new Aula("Aula Trabalhando com ArrayLust",23));
		//javaColecoes.getAulas().add(new Aula("Aula Trabalhando com ArrayLust",23));
		javaColecoes.adiciona(new Aula("Aula Trabalhando com ArrayLust",23));
		javaColecoes.adiciona(new Aula("Modelando com uml",21));
		javaColecoes.adiciona(new Aula("Aula tal tal tal",19));
		
		//System.out.println(aulas);// igual ao codigo abaixo
		//System.out.println(javaColecoes.getAulas());
		
		//comparando as referencias: true
		//System.out.println(aulas == javaColecoes.getAulas());
		System.out.println(javaColecoes.getAulas());
		
		
		
		
	}
}
