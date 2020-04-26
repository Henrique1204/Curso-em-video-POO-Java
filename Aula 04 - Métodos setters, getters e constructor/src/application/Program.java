package application;
import entidades.Canetas;

public class Program {
	public static void main(String[] args) {
		Canetas canetaUm = new Canetas("Bic", "Azul", 0.5f);

		canetaUm.status();
	}
}