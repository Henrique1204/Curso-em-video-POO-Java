package entidades;

//Herença de Implementação
public class Lobo extends Mamifero{
	 public Lobo(double newPeso, int newIdade, int newMembros, String newCorPelo){
	        super(newPeso, newIdade, newMembros, newCorPelo);
	    }

	 //Método sobrescrevido
	 @Override
	 public void emitirSom() {
		 System.out.println("Auuuuuuuuuuuuuuuuu!");
	 }
}
