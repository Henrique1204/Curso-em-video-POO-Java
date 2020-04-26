package application;

import entidades.ContaBanco;

public class Program {
	public static void main(String[] args) {
    	System.out.println("--------------------------------------------------");
		ContaBanco pessoa1 = new ContaBanco();

		pessoa1.setNumConta("1111");
		pessoa1.setDono("Jubileu");

		pessoa1.abrirConta("cc");
		pessoa1.depositar(300);

		pessoa1.statusAtual();

    	System.out.println("--------------------------------------------------");
		ContaBanco pessoa2 = new ContaBanco();

		pessoa2.setNumConta("2222");
		pessoa2.setDono("Creusa");

		pessoa2.abrirConta("cp");
		pessoa2.depositar(500);
		pessoa2.sacar(100);

		pessoa2.statusAtual();
	}
}