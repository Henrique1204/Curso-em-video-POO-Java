package entidades;

//Herança de diferença
public class Reptil extends Animal {
    private String corEscama;

    //Construtor
    public Reptil(double newPeso, int newIdade, int newMembros, String newCorEscama){
        super(newPeso, newIdade, newMembros);
        this.setCorEscama(newCorEscama);
    }

    //Getters
    public String getCorEscama(){
        return this.corEscama;
    }

    //Setters
    public void setCorEscama(String valor){
        this.corEscama = valor;
    }

    //Métodos sobrescrevidos
    @Override
    public void locomover(){
	   System.out.println("Rastejando...");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais...");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil...");
    }
}
