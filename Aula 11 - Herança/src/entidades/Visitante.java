package entidades;

//Heran�a de implementa��o
//Classe final n�o permite que a classe seja usada como heran�a para outra classe
final public class Visitante extends Pessoa {
	public Visitante(String newNome, int newIdade, char newSexo) {
		super(newNome, newIdade, newSexo);
	}
}
