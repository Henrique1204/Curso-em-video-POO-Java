package entidades;

//Herança de implementação
//Classe final não permite que a classe seja usada como herança para outra classe
public class Cobra extends Reptil{
	public Cobra(double newPeso, int newIdade, int newMembros, String newCorEscama){
        super(newPeso, newIdade, newMembros, newCorEscama);
    }
}
