package entidades;

//Herança de implementação
//Classe final não permite que a classe seja usada como herança para outra classe
public class PeixeDourado extends Peixe {
	public PeixeDourado(double newPeso, int newIdade, int newMembros, String newCorEscama){
        super(newPeso, newIdade, newMembros, newCorEscama);
    }
}
