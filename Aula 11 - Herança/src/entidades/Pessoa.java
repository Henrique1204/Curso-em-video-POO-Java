package entidades;

//Classe abstrata n�o pode virar objeto
public abstract	 class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    //Construtor
    public Pessoa(String newNome, int newIdade, char newSexo) {
    	this.setNome(newNome);
    	this.setIdade(newIdade);
    	this.setSexo(newSexo);
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public char getSexo(){
        return this.sexo;
    }

    //Setters
    public void setNome(String valor){
        this.nome = valor;
    }

    public void setIdade(int valor){
        this.idade = valor;
    }

    public void setSexo(char valor){
        this.sexo = valor;
    }

    //M�todos comuns
    //M�todo final n�o pode ser sobrescristo
    public final void fazerAniversario()
    {
        this.setIdade(this.getIdade() + 1);
    }
}
