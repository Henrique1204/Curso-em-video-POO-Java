package entidades;

//Herança de diferença
//Classe final não permite que a classe seja usada como herança para outra classe
final public class Canguru extends Mamifero {
	public Canguru(double newPeso, int newIdade, int newMembros, String newCorPelo){
        super(newPeso, newIdade, newMembros, newCorPelo);
    }

    //Sobrescrevendo métodos
	@Override
    public void locomover(){
        System.out.println("Saltando...");
    }

    //Métodos publicos
    public void usarBolsa(){
        System.out.println("Usando bolsa...");
    }
}
