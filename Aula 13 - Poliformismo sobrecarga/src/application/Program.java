package application;

import entidades.*;

public class Program {
	public static void main(String[] args) {
		//Instânciando
        Mamifero mamifero = new Mamifero(33.5, 4, 4, "Marrom");
        Cachorro cachorro = new Cachorro(20, 4, 4, "Branco e preto");
        Lobo lobo = new Lobo(30, 6, 4, "Cinza");

        //Usando métodos
        cachorro.reagir("olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5);
        cachorro.reagir(17, 4.5);
	}
}