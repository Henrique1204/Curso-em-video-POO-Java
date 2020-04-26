package application;
import entidades.*;

public class Program {
	public static void main(String[] args) {
		//Computadores
		//Inst�nciando computador
		Computadores computador = new Computadores();

		System.out.println("Computador:\n");

		//Inicializando atributos
		computador.modelo = "Essentials E30";
		computador.marca = "Samsung";
		computador.programas = "Paint e Bloco de notas";
		computador.tempoDeUso = 6;

		//Usando m�todos
		computador.ligar();
		computador.usarPrograma();
		computador.status();

		//MaquinaDeCostura
		//Inst�nciando maquina
		MaquinaDeCostura maquina = new MaquinaDeCostura();

		System.out.println("\nMaquina de costura:\n");

		//Inicializando atributos
		maquina.tempoDeUso = 60;

		//Usando m�todos
		maquina.desligar();
		maquina.removerLinha();
		maquina.status();

		//Cursos
		//Inst�nciando curso
		Cursos curso = new Cursos();

		System.out.println("\nCursos:\n");

		//Inicializando atributos
		curso.duracao = 18;
		curso.aulas = "POO";
		curso.iniciado = true;

		//Usando m�todos
		curso.assistir();
		curso.pausar();
		curso.fazerExercicio();
		curso.status();

		//Fam�lia
		//Inst�nciando familia
		Familia familia = new Familia();

		System.out.println("\nFamilia:\n");

		//Inicializando atributos
		familia.pais = "Elino e Maria";
		familia.filhos = "Rita, Rosa, Aline e Paulo";
		familia.netos = "Jennifer, Emily, Jo�o, Luiz, Cristian e Ana";

		//Usando m�todos
		familia.ajudar();
		familia.juntar();
		familia.status();
		
	}
}