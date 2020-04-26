package entidades;

//Classe final n�o permite que a classe seja usada como heran�a para outra classe
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

    //M�todos sobrescristo
    @Override
    public void pagarMensalidade() {
        System.out.println("\n    Pagou a mensalidade com desconto!");
    }

    //M�todos publicos
    public void renovarBolsa(){
        System.out.println("\n    Renovou a bolsa!");
    }
}
