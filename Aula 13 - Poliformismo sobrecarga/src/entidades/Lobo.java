package entidades;

//Heren�a de Implementa��o
public class Lobo extends Mamifero{
	 public Lobo(double newPeso, int newIdade, int newMembros, String newCorPelo){
	        super(newPeso, newIdade, newMembros, newCorPelo);
	    }

	 //M�todo sobrescrevido
	 @Override
	 public void emitirSom() {
		 System.out.println("Auuuuuuuuuuuuuuuuu!");
	 }
}
