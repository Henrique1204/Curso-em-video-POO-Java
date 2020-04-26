package entidades;

import interfaces.AcoesVideo;

public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;

	//Construtor
	public Video(String newTitulo) {
		this.setTitulo(newTitulo);
		this.setAvaliacao(1);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}

	//Getters
	public String getTitulo() {
		return this.titulo;
	}

	public int getAvaliacao() {
		return this.avaliacao;
	}

	public int getViews() {
		return this.views;
	}

	public int getCurtidas() {
		return this.curtidas;
	}

	public boolean isReproduzindo() {
		return this.reproduzindo;
	}

	//Setters
	public void setTitulo(String valor) {
		this.titulo = valor;
	}

	public void setAvaliacao(int valor) {
		this.avaliacao = this.getViews() == 0 ? valor : (this.getAvaliacao() + valor) / this.getViews();
	}

	public void setViews(int valor) {
		this.views = valor;
	}

	public void setCurtidas(int valor) {
		this.curtidas = valor;
	}

	public void setReproduzindo(boolean valor) {
		this.reproduzindo = valor;
	}

	//Sobrescrevendo métodos
	@Override
	public String toString() {
		return "Título: '" + this.getTitulo() + "' | Avaliação: '" + this.getAvaliacao()
				+ "' | Views: '" + this.getViews() + "' | Likes: '" + this.getCurtidas() + "' | Repoduzindo? " + (this.isReproduzindo() ? "Sim." : "Não." );
	}

	//Métodos da interface
	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}
}
