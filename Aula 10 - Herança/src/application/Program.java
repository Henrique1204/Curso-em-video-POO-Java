package application;

import entidades.*;

public class Program {

	public static void main(String[] args) {
        Aluno aluno = new Aluno("Paulo", 18, 'M', 123456789, "POO");
        Professor professor = new Professor("Gustavo", 28, 'M', "Tecnologia", 900.50);
        Funcionario funcionario = new Funcionario("Maria", 60, 'F', "Culinária", false);

        System.out.println("__ Aluno __\n");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSexo());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getCurso());

        System.out.println("\n__ Professor __\n");
        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());
        System.out.println(professor.getSexo());
        System.out.println(professor.getEspecialidade());
        System.out.println(professor.getSalario());

        System.out.println("\n__ Funcionario __\n");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getSexo());
        System.out.println(funcionario.getSetor());
        System.out.println(funcionario.getTrabalhando());
	}

}
