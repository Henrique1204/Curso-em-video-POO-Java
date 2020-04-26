package entidades;

import entidades.Pessoa;
import interfaces.Publicacao;

public class Livro implements Publicacao {
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	//Contrutor
	public Livro(String newTitulo, String newAutor, int newTotPaginas, Pessoa newLeitor) {
		this.setTitulo(newTitulo);
		this.setAutor(newAutor);
		this.setTotPaginas(newTotPaginas);
		this.setPagAtual(0);
		this.setAberto(false);
		this.setLeitor(newLeitor);
	}

	//Getters
	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public int getTotPaginas() {
		return this.totPaginas;
	}

	public int getPagAtual() {
		return this.pagAtual;
	}

	public boolean isAberto() {
		return this.aberto;
	}

	public Pessoa getLeitor() {
		return this.leitor;
	}

	//Setters
	public void setTitulo(String valor) {
		this.titulo = valor;
	}

	public void setAutor(String valor) {
		this.autor = valor;
	}

	public void setTotPaginas(int valor) {
		this.totPaginas = valor;
	}

	public void setPagAtual(int valor) {
		this.pagAtual = valor < 0 ? 0 : valor;
	}

	public void setAberto(boolean valor) {
		this.aberto = valor;
	}

	public void setLeitor(Pessoa valor) {
		this.leitor = valor;
	}

	public void detalhes() {
		System.out.println("\n  ----Painel de detalhes----");
		System.out.println("  Titulo: " + this.titulo + ".");
		System.out.println("  Autor: " + this.autor + ".");
		System.out.println("  Total de Páginas: " + this.totPaginas + ".");
		System.out.println("  Página atual: " + this.pagAtual + ".");
	}

	//Métodos de Interface
	@Override
	public void pegarLivro() {
		if(this.isAberto()) {
			this.setAberto(false);
			System.out.println("\n  O livro foi fechado!");
		}
		else {
			this.setAberto(true);
			System.out.println("\n  O livro foi aberto!");
		}
	}

	@Override
	public void folhear(int valor) {
		this.setPagAtual(valor);
	}

	@Override
	public void mudarPagina(int valor)
	{
		if(this.isAberto())
		{
			if(this.getPagAtual() < this.getTotPaginas() || valor < 0)
			{
				for(int i = 0; i <= valor; i++)
				{
					this.setPagAtual(this.getPagAtual() < this.getTotPaginas() ? this.getPagAtual() + 1 : this.getPagAtual() + 0);
				}
				System.out.println("\n    Página atual: " + this.getPagAtual() + ".");
			}
			else
			{
				System.out.println("\n    [ERRO] Você já chegou no final do livro!");
			}
		}
		else
		{
			System.out.println("\n    [ERRO] O livro está fechado, abra ele antes de mudar a página!");
		}
	}
}
