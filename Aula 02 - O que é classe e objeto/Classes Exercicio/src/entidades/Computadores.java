package entidades;

public class Computadores {
	public String modelo, marca, programas;
	public int tempoDeUso;
	boolean ligado, usandoPrograma;

	public void status() {
		System.out.println("  Tempo de uso: " + (this.tempoDeUso <= 6 ? "novo" : "velho") + ".");
		System.out.println("  Ligado? " + (this.ligado? "Sim" : "Não" + "."));
		System.out.println("  Está usando programas? " + (this.usandoPrograma? "Usando" : "Não Usando") + ".");
	}

	public void ligar() {
		this.ligado = true;
		System.out.println("    Ligando...\n");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("    Desligando...\n");
	}

	public void usarPrograma() {
		this.usandoPrograma = true;
		System.out.println("    Usando Programa...\n");
	}

	public void encerrarPrograma() {
		this.usandoPrograma = false;
		System.out.println("    Encerrando Programa...\n");
	}
}