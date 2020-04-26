package entidades;

public class MaquinaDeCostura {
	public String modelo;
	public int tempoDeUso;
	boolean linha, ligado;

	public void status() {
		System.out.println("  Tempo de uso: " + (this.tempoDeUso <= 6 ? "novo" : "velho") + ".");
		System.out.println("  Ligado? " + (this.ligado == true ? "Sim" : "Não" + "."));
		System.out.println("  Está com linha? " + (this.linha ? "Usando" : "Não Usando") + ".");
	}

	public void ligar() {
		this.ligado = true;
		System.out.println("    Ligando...\n");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("    Desligando...\n");
	}

	public void colocarLinha() {
		linha = true;
		System.out.println("    Colocando linha...\n");
	}

	public void removerLinha() {
		linha = false;
		System.out.println("    Removendo linha...\n");
	}
}