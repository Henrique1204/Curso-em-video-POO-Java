package entidades;

//Classe final n�o permite que a classe seja usada como heran�a para outra classe
final public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    //Construtor
    public Professor(String newNome, int newIdade, char newSexo, String newEspecialidade, double newSalario){
        super(newNome, newIdade, newSexo);
        this.setEspecialidade(newEspecialidade);
        this.setSalario(newSalario);
    }

    //Getters
    public String getEspecialidade(){
        return this.especialidade;
    }

    public double getSalario(){
        return this.salario;
    }

    //Setters
    public void setEspecialidade(String valor){
        this.especialidade = valor;
    }

    public void setSalario(double valor){
        this.salario = valor;
    }

    //M�todos publicos
    public void receberAumento(double valor){
        this.setSalario(this.getSalario() + valor);
    }
}