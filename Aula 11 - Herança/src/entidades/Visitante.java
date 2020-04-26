package entidades;

//Herança de implementação
//Classe final não permite que a classe seja usada como herança para outra classe
final public class Visitante extends Pessoa {
	public Visitante(String newNome, int newIdade, char newSexo) {
		super(newNome, newIdade, newSexo);
	}
}
