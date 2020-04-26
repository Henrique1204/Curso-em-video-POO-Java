package entidades;

//Classe final não permite que a classe seja usada como herança para outra classe
final public class Bolsista extends Aluno{
    private int bolsa;

    //Construtor
    public Bolsista(String newNome, int newIdade, char newSexo,int newMatricula, String newCurso, int newBolsa){
        super(newNome, newIdade, newSexo, newMatricula, newCurso);
        this.setBolsa(newBolsa);
    }

    //Getters
    public int getBolsa(){
        return this.bolsa;
    }

    //Setters
    public void setBolsa(int valor){
        this.bolsa = valor;
    }

    //Métodos sobrescristo
    @Override
    public void pagarMensalidade() {
        System.out.println("\n    Pagou a mensalidade com desconto!");
    }

    //Métodos publicos
    public void renovarBolsa(){
        System.out.println("\n    Renovou a bolsa!");
    }
}
