package application;

import entidades.*;

public class Program {
	public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        Luta lutas = new Luta();

        lutadores[0] = new Lutador("Pretty Boy", "Frânça", 31, 11, 3, 1, 1.75, 68.9);
        lutadores[1] = new Lutador("Putscript", "Brasil", 28, 14, 2, 3, 1.68, 57.8);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65, 80.9);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93, 81.6);
        lutadores[4] = new Lutador("UFOCobol", "Brasil", 37, 5, 4, 3, 1.70, 119.3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 12, 2, 4, 1.81, 105.7);

        
        lutas.marcarLuta(lutadores[0], lutadores[1]);
        lutas.lutar();

        lutas.marcarLuta(lutadores[2], lutadores[3]);
        lutas.lutar();

        lutas.marcarLuta(lutadores[4], lutadores[5]);
        lutas.lutar();
	}
}