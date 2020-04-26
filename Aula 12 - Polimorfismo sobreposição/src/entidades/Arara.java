package entidades;

//Herança de implementação
//Classe final não permite que a classe seja usada como herança para outra classe
public class Arara extends Ave{
	public Arara(double newPeso, int newIdade, int newMembros, String newCorPena){
        super(newPeso, newIdade, newMembros, newCorPena);
    }
}
