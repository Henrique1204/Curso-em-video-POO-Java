package entidades;

//Herança de diferença
public class Aluno extends Pessoa{
	private int matricula;
    private String curso;

    //Construtor
    public Aluno(String newNome, int newIdade, char newSexo, int newMatricula, String newCurso){
    	super(newNome, newIdade, newSexo);
        this.setMatricula(newMatricula);
        this.setCurso(newCurso);
    }

    //Getters
    public int getMatricula(){
        return this.matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    //Setters
    public void setMatricula(int valor){
        this.matricula = valor;
    }

    public void setCurso(String valor){
        this.curso = valor;
    }

    //Métodos publicos
    public void pagarMensalidade(){
        System.out.println("\n    Pagou a mensalidade!");
    }
}
