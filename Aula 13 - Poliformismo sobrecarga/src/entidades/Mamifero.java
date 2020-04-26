package entidades;

//Henrança de diferença
public class Mamifero extends Animal {
    protected String corPelo;

    //Construtor
    public Mamifero(double newPeso, int newIdade, int newMembros, String newCorPelo){
        super(newPeso, newIdade, newMembros);
        this.setCorPelo(newCorPelo);
    }

    //Getters
    public String getCorPelo(){
        return this.corPelo;
    }

    //Setters
    public void setCorPelo(String valor){
        this.corPelo = valor;
    }

    //Métodos sobrescrevidos
    @Override
    public void emitirSom(){
       System.out.println("Som de mamífero...");
    }
}
