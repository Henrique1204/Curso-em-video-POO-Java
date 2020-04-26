package entidades;

public class Canetas {
	private String modelo, cor;
	private float ponta;
	private boolean tampada;

	public Canetas(String newModelo, String newCor, float newPonta) {
		this.setModelo(newModelo);
		this.setCor(newCor);
		this.setPonta(newPonta);
		this.tampar();
	}

	public void status() {
		System.out.println("Modelo: '" + this.modelo + "'.");
		System.out.println("Cor: '" + this.cor + "'.");
		System.out.println("Ponta: '" + this.ponta + "'.");
		System.out.println("Tampada: '" + (this.tampada ? "Sim" : "Não") + "'.");
	}

	public void setModelo(String newModelo) {
		this.modelo = newModelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setCor(String newCor) {
		this.cor = newCor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setPonta(float newPonta) {
		this.ponta = newPonta;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void tampar() {
		this.tampada = true;
	}
}