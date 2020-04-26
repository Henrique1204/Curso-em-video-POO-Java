package entidades;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;

	//Construtor
	public Pessoa(String newNome, int newIdade, char newSexo) {
		this.setNome(newNome);
		this.setIdade(newIdade);
		this.setSexo(newSexo);
	}

	//Getters
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public char getSexo() {
		return this.sexo;
	}

	//Setters
	public void setNome(String valor) {
		this.nome = valor;
	}

	public void setIdade(int valor) {
		this.idade = valor;
	}

	public void setSexo(char valor) {
		this.sexo = valor;
	}

	//Métodos públicos
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}
