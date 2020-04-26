package entidades;

//Herança de diferença
//Classe final não permite que a classe seja usada como herança para outra classe
final public class Cachorro extends Mamifero {
	public Cachorro(double newPeso, int newIdade, int newMembros, String newCorPelo){
        super(newPeso, newIdade, newMembros, newCorPelo);
    }

    //Métodos publicos
    public void enterrarOsso(){
        System.out.println("Enterrou o osso...");
    }

    public void abanarRabo(){
        System.out.println("Abanou o rabo...");
    }
}
