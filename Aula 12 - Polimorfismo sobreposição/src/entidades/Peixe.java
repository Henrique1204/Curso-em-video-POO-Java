package entidades;

//Heran�a de diferen�a
public class Peixe extends Animal{
    private String corEscama;

    //Construtor
    public Peixe(double newPeso, int newIdade, int newMembros, String newCorEscama){
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

    //M�todos sobrescrevidos
    @Override
    public void locomover(){
	   System.out.println("Nadando...");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo subst�ncias...");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe n�o faz som...");
    }

    //M�todos publicos
    public void soltarBolha() {
    	System.out.println("Soltando bolha...");
    }
}
