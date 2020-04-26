package application;

import entidades.Aluno;
import entidades.Bolsista;
import entidades.Tecnico;

public class Program {

	public static void main(String[] args) {
        Aluno aluno = new Aluno("Paulo", 18, 'M', 123456789, "POO");
        Bolsista bolsista = new Bolsista("Maria", 60, 'F',987654321, "PHP" ,9876);
        Tecnico tecnico = new Tecnico("Zé", 24, 'M', 192837465, "Java", 1234);

        aluno.pagarMensalidade();

        bolsista.renovarBolsa();
        bolsista.pagarMensalidade();

        tecnico.praticar();
        tecnico.pagarMensalidade();
	}

}
