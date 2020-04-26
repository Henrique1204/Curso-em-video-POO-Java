package entidades;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    //Construtor
    public Funcionario(String newNome, int newIdade, char newSexo, String newSetor, boolean newTrabalhando){
        this.setNome(newNome);
        this.setIdade(newIdade);
        this.setSexo(newSexo);
        this.setSetor(newSetor);
        this.setTrabalhando(newTrabalhando);
    }

    //Getters
    public String getSetor(){
        return this.setor;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }

    //Setters
    public void setSetor(String valor){
        this.setor = valor;
    }

    public void setTrabalhando(boolean valor){
        this.trabalhando = valor;
    }

    //Métodos publicos
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
}
