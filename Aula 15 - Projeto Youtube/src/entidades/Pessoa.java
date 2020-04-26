package entidades;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected char sexo;
	protected float experiencia;

	//Contrutor
	public Pessoa(String newNome, int newIdade, char newSexo) {
		this.setNome(newNome);
		this.setIdade(newIdade);
		this.setSexo(newSexo);
		this.setExperiencia(0);
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

	public float getExperiencia() {
		return this.experiencia;
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

	public void setExperiencia(float valor) {
		this.experiencia = valor;
	}

	//Métodos comuns
	//Métodos final não podem ser sobrescrevidos
	final protected void ganharExperiencia() {
		
	}

	//Sobrescrevendo métodos
		@Override
		public String toString() {
			return "Nome: " + this.getNome() + " | Idade: " + this.getIdade() + " | Sexo: " + this.getSexo();
		}
}
