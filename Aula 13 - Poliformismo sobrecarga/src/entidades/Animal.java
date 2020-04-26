package entidades;

//Classe abstrata n�o pode ser inst�nciada como objeto
public abstract class Animal {
    protected double peso;
    protected int idade, membros;

    //Constructor
    public Animal(double newPeso, int newIdade, int newMembros){
        this.setPeso(newPeso);
        this.setIdade(newIdade);
        this.setMembros(newMembros);
    }

    //Getters
    public double getPeso(){
        return this.peso;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getMembros(){
        return this.membros;
    }

    //Setters
    public void setPeso(double valor){
        this.peso = valor;
    }

    public void setIdade(int valor){
        this.idade = valor;
    }

    public void setMembros(int valor){
        this.membros = valor;
    }

    //M�todos comuns
    //M�todo abstrato devem ser sobrescrevido
    public abstract void emitirSom();
}
