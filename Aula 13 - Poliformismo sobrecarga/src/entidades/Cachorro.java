package entidades;

public class Cachorro extends Lobo {
	 public Cachorro(double newPeso, int newIdade, int newMembros, String newCorPelo){
	        super(newPeso, newIdade, newMembros, newCorPelo);
	    }

	 //Método sobrescrevido
	 @Override
	 public void emitirSom() {
		 System.out.println("Au au au!");
	 }

	 //Métodos sobrecarregados
	 public void reagir(String frase) {
		String f = frase.toLowerCase();
		System.out.println(f.equals("olá") || f.equals("toma comida")  ? "Abanar e latir" : "Rosnar");
	 }

	 public void reagir(int hora, int minuto) {
		 System.out.println(hora < 12 ? "Abanar" : hora > 18 ? "Ignorar" : "Abanar e latir");
	 }

	 public void reagir(boolean dono) {
		 System.out.println(dono ? "Abanar" : "Rosnar e latir");
	 }

	 public void reagir(int idade, double peso) {
		 if(idade < 5) {
			 System.out.println(peso < 10 ? "Abanar" : "Latir");
		 }else {
			 System.out.println(peso < 10 ? "Rosnar" : "Ignorar");
		 }
	 }
}