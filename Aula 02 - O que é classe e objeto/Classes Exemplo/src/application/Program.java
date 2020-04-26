package application;
import entidades.Canetas;

public class Program {
	public static void main(String[] args) {
		Canetas canetaUm = new Canetas();
		Canetas canetaDois = new Canetas();

		canetaUm.cor = "Azul";
		canetaUm.ponta = 0.5f;
		canetaUm.destampar();

		canetaDois.modelo = "Senai";
		canetaDois.cor = "Preta";
		canetaDois.tampar();

		canetaUm.rabiscar();
		canetaDois.rabiscar();
	}
}