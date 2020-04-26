package entidades;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;

	//Contrutor
	public Visualizacao(Gafanhoto newEspectador, Video newFilme) {
		this.setEspectador(newEspectador);
		this.setFilme(newFilme);
		this.espectador.verVideo();
		this.filme.setViews(this.filme.getViews() + 1);
	}

	//Getters
	public Gafanhoto getEspectador() {
		return this.espectador;
	}

	public Video getFilme() {
		return this.filme;
	}

	//Setters
	public void setEspectador(Gafanhoto valor) {
		this.espectador = valor;
	}

	public void setFilme(Video valor) {
		this.filme = valor;
	}

	//Métodos sobrescrevidos
	@Override
	public String toString() {
		return "Espectador: " + espectador.getNome() + " | Filme: " + filme.getTitulo() + " | Avaliação: " + filme.getAvaliacao();
	}

	//Métodos comuns
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porcentagem) {
		if(porcentagem <= 20) {
			this.filme.setAvaliacao(3);
		}else if(porcentagem <= 50) {
			this.filme.setAvaliacao(5);
		}else if(porcentagem <= 90) {
			this.filme.setAvaliacao(8);
		}else {
			this.filme.setAvaliacao(10);
		}
	}
}
