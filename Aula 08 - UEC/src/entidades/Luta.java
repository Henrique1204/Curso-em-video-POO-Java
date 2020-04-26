package entidades;

import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;

	//Getters
	public Lutador getDesafiado() {
		return this.desafiado;
	}

	public Lutador getDesafiante() {
		return this.desafiante;
	}

	public int getRounds() {
		return this.rounds;
	}

	public boolean isAprovada() {
		return this.aprovada;
	}

	//Setters
	public void setDesafiado(Lutador valor) {
		this.desafiado = valor;
	}

	public void setDesafiante(Lutador valor) {
		this.desafiante = valor;
	}

	public void setRounds(int valor) {
		this.rounds = valor;
	}

	public void setAprovada(boolean valor) {
		this.aprovada = valor;
	}
	
	//Métodos Públicos
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	public void lutar() {
		if(this.isAprovada()) {
			System.out.println("\n## DESAFIADO ##");
			this.getDesafiado().apresentar();
			System.out.println("\n## DESAFIANTE ##");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);

			switch(vencedor) {
				case 0:
					System.out.println("__ Empatou! __");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1:
					System.out.println("__ O desafiado " + this.getDesafiado().getNome() + " venceu. __");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2:
					System.out.println("__ O desafiante " + this.getDesafiante().getNome() + " venceu. __");
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
				default:
					System.out.println("__ Algo deu errado! __");
					break;
			}
		}else {
			System.out.println("A luta não pode acontecer");
		}
	}
}
