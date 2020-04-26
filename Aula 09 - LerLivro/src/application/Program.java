package application;

import entidades.*;

public class Program {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Paulo", 18, 'M');
		Livro livro = new Livro("Primeiro teste", "Paulo", 100, pessoa);

		livro.pegarLivro();
		livro.detalhes();
		livro.folhear(58);
		livro.mudarPagina(3);
		livro.detalhes();
		livro.pegarLivro();
	}
}