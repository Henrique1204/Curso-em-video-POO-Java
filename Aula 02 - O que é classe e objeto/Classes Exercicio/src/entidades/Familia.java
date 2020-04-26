package entidades;

public class Familia {
	public String pais, filhos, netos;
	boolean juntos;

	public void status() {
		System.out.println("Estão juntos? " + (this.juntos ? "Sim" : "Não"));
	}

	public void ajudar() {
		System.out.println("    Estamos ajudando...\n");
	}

	public void criticar() {
		System.out.println("    Estamos criticando...\n");
	}

	public void juntar() {
		juntos = true;
		System.out.println("    Se juntando...\n");
	}

	public void afastar() {
		juntos = false;
		System.out.println("    Se afastando...\n");
	}
}
