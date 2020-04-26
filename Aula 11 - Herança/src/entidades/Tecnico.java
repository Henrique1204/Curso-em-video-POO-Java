package entidades;


final public class Tecnico extends Aluno {
	private int registroProfissional;

    //Construtor
    public Tecnico(String newNome, int newIdade, char newSexo,int newMatricula, String newCurso, int newRegistroProfissional){
        super(newNome, newIdade, newSexo, newMatricula, newCurso);
        this.setRegistroProfissional(newRegistroProfissional);
    }

	//Getters
    public int getRegistroProfissional() {
    	return this.registroProfissional;
    }

    //Setters
    public void setRegistroProfissional(int valor) {
    	this.registroProfissional = valor;
    }

    //Métodos publicos
    public void praticar() {
    	System.out.println("\n    Está praticando!");
    }
}
