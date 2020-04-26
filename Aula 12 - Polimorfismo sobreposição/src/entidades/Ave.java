package entidades;

//Herança de diferença
public class Ave extends Animal {
    private String corPena;

    //Construtor
    public Ave(double newPeso, int newIdade, int newMembros, String newCorPena){
        super(newPeso, newIdade, newMembros);
        this.setCorPena(newCorPena);
    }

    //Getters
    public String getCorPena(){
        return this.corPena;
    }

    //Setters
    public void setCorPena(String valor){
        this.corPena = valor;
    }

   //Métodos sobrescrevidos
    public void locomover(){
        System.out.println("Voando...");
    }

    public void alimentar(){
        System.out.println("Comendo frutas...");
    }

    public void emitirSom(){
        System.out.println("Som de ave...");
    }

    //Métodos públicos
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
}