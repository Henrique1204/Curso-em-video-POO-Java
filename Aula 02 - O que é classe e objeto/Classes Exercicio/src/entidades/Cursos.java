package entidades;

public class Cursos {
	public String  aulas;
	public int duracao;
	public boolean iniciado;
	boolean exercicios, assistindo;

	public void status() {
		System.out.println("  Iniciou o curso? " + (this.iniciado ? "Sim" : "N�o"));
		System.out.println("  As aulas est�o passando? " + (this.assistindo ? "Sim, est�o sendo exibidas" : "N�o, est� pausado"));
		System.out.println("  Os exerc�cios foram feitos? " + (this.exercicios ? "Sim" : "N�o"));
	}

	public void assistir() {
		assistindo = true;
		System.out.println("    Aulas em exibi��o...\n");
	}

	public void pausar() {
		assistindo = false;
		System.out.println("    Aulas est�o pausadas...\n");
	}

	public void fazerExercicio() {
		exercicios = true;
		System.out.println("    Fazendo exerc�cios...\n");
	}
}
