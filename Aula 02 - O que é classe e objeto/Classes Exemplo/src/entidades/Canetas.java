package entidades;

public class Canetas {
	public String modelo, cor;
	public float ponta;
	public int carga;
	boolean tampada;

	public void status() {
		System.out.println("O modelo da caneta é: " + this.modelo);
		System.out.println("A cor da caneta é: " + this.cor);
		System.out.println("A ponta é: " + String.format("%.1f", this.ponta));
		System.out.println("A carga está em: " + this.carga + "%");
		System.out.print("Ela está " + (this.tampada? "tampada" : "destampada"));
	}

	public void rabiscar() {
		if(this.tampada) {
			System.out.println("[ERRO] A caneta está tampada!");
		}
		else {
			System.out.println("Rabiscou!");
		}
	}

	public void destampar() {
		this.tampada = false;
	}

	public void tampar() {
		this.tampada = true;
	}
}