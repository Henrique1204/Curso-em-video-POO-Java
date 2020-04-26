package entidades;

//Heran�a de diferen�a
//Classe final n�o permite que a classe seja usada como heran�a para outra classe
final public class Canguru extends Mamifero {
	public Canguru(double newPeso, int newIdade, int newMembros, String newCorPelo){
        super(newPeso, newIdade, newMembros, newCorPelo);
    }

    //Sobrescrevendo m�todos
	@Override
    public void locomover(){
        System.out.println("Saltando...");
    }

    //M�todos publicos
    public void usarBolsa(){
        System.out.println("Usando bolsa...");
    }
}
