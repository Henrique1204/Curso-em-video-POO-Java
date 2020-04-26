package entidades;

//Heran�a de diferen�a
//Classe final n�o permite que a classe seja usada como heran�a para outra classe
final public class Cachorro extends Mamifero {
	public Cachorro(double newPeso, int newIdade, int newMembros, String newCorPelo){
        super(newPeso, newIdade, newMembros, newCorPelo);
    }

    //M�todos publicos
    public void enterrarOsso(){
        System.out.println("Enterrou o osso...");
    }

    public void abanarRabo(){
        System.out.println("Abanou o rabo...");
    }
}
