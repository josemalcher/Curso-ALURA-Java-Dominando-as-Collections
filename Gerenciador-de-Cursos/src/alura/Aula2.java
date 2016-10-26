package alura;

public class Aula2 implements Comparable<Aula2>{
	private String titulo;
	private int tempo;

	public Aula2(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "\nAula2 [titulo=" + titulo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula2 outraAula) {
		
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
