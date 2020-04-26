package application;

import entidades.Video;
import entidades.Gafanhoto;
import entidades.Visualizacao;

public class Program {
	public static void main(String[] args) {
		Video[] videos = new Video[3];
		Gafanhoto[] gafanhotos = new Gafanhoto[2];
		Visualizacao[] visualizacoes = new Visualizacao[2];

		videos[0] = new Video("Aula 1 de POO");
		videos[1] = new Video("Aula 12 de PHP");
		videos[2] = new Video("Aula 10 de HTML5");

		gafanhotos[0] = new Gafanhoto("Paulo", 18, 'M', "pauloh16");
		gafanhotos[1] = new Gafanhoto("Maria", 60, 'F', "mãe24");

		visualizacoes[0] = new Visualizacao(gafanhotos[0], videos[0]);
		visualizacoes[0] = new Visualizacao(gafanhotos[0], videos[2]);
		visualizacoes[1] = new Visualizacao(gafanhotos[1], videos[1]);
		visualizacoes[1] = new Visualizacao(gafanhotos[1], videos[2]);

		System.out.println("Visualizacao----------------------------------");
		for(Visualizacao visualizacao : visualizacoes) {
			System.out.println(visualizacao.toString());
		}

		System.out.println("\nGafanhotos-----------------------------------");
		for(Gafanhoto gafanhoto : gafanhotos) {
			System.out.println(gafanhoto.toString());
		}

		System.out.println("\nVideos-----------------------------------------");
		for(Video video : videos) {
			System.out.println(video.toString());
		}
	}
}