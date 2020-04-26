package entidades;

//Heran�a de diferen�a
//Classe final n�o permite que a classe seja usada como heran�a para outra classe
public class Tartaruga extends Reptil {
	public Tartaruga(double newPeso, int newIdade, int newMembros, String newCorEscama){
        super(newPeso, newIdade, newMembros, newCorEscama);
	}

    //Sobrescrevendo m�todos
	@Override
    public void locomover(){
        System.out.println("Andando beeeeeem devagar...");
    }
}
