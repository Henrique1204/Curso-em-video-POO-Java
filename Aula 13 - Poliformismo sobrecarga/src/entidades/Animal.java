package entidades;

//Classe abstrata não pode ser instânciada como objeto
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

    //Métodos comuns
    //Método abstrato devem ser sobrescrevido
    public abstract void emitirSom();
}
