package entidades;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistindo;

	//Construtor
	public Gafanhoto(String newNome, int newIdade, char newSexo, String newLogin) {
		super(newNome, newIdade, newSexo);
		this.setLogin(newLogin);
		this.setTotAssistindo(0);
	}

	//Getters
	public String getLogin() {
		return this.login;
	}

	public int getTotAssistindo() {
		return this.totAssistindo;
	}

	//Setters
	public void setLogin(String valor) {
		this.login = valor;
	}

	public void setTotAssistindo(int valor) {
		this.totAssistindo = valor;
	}

	//M�todos comuns
	public void verVideo() {
		this.setTotAssistindo(this.getTotAssistindo() + 1);
	}

	//Sobrescrevendo m�todos
	@Override
	public String toString() {
		return super.toString() + " | Login: " + this.getLogin() + " | Total de videos assistidos: " + this.getTotAssistindo() + ".";
	}
}