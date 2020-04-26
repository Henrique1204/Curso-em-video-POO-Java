package entidades;

//Herança de diferença
//Classe final não permite que a classe seja usada como herança para outra classe
public class Tartaruga extends Reptil {
	public Tartaruga(double newPeso, int newIdade, int newMembros, String newCorEscama){
        super(newPeso, newIdade, newMembros, newCorEscama);
	}

    //Sobrescrevendo métodos
	@Override
    public void locomover(){
        System.out.println("Andando beeeeeem devagar...");
    }
}
