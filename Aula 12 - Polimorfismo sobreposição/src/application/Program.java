package application;

import entidades.*;

public class Program {
	public static void main(String[] args) {
		//Instânciando
        Mamifero mamifero = new Mamifero(33.5, 4, 4, "Marrom");
        Reptil reptil = new Reptil(50, 7, 0, "Verde");
        Peixe peixe = new Peixe(10, 6, 3, "Laranja");
        Ave ave = new Ave(12, 1, 4, "Morrom claro");
        Canguru canguru = new Canguru(60, 5, 4, "Marrom escuro");

        //Usando métodos
        mamifero.locomover();
        reptil.locomover();
        peixe.locomover();
        ave.locomover();
        canguru.locomover();
	}
}