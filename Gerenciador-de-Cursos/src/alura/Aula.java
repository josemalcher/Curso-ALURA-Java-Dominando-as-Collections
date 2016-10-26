package alura;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		super();
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
		return "\nAula [titulo=" + titulo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula outroAula) {
		
		return this.titulo.compareTo(outroAula.titulo) ;
	}
	
	
	
	
}
