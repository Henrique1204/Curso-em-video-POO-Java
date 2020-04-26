package entidades;

public class Cursos {
	public String  aulas;
	public int duracao;
	public boolean iniciado;
	boolean exercicios, assistindo;

	public void status() {
		System.out.println("  Iniciou o curso? " + (this.iniciado ? "Sim" : "Não"));
		System.out.println("  As aulas estão passando? " + (this.assistindo ? "Sim, estão sendo exibidas" : "Não, está pausado"));
		System.out.println("  Os exercícios foram feitos? " + (this.exercicios ? "Sim" : "Não"));
	}

	public void assistir() {
		assistindo = true;
		System.out.println("    Aulas em exibição...\n");
	}

	public void pausar() {
		assistindo = false;
		System.out.println("    Aulas estão pausadas...\n");
	}

	public void fazerExercicio() {
		exercicios = true;
		System.out.println("    Fazendo exercícios...\n");
	}
}
