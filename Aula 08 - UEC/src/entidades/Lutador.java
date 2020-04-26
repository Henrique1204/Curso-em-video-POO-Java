package entidades;

public class Lutador {
	 //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    //Construtor
    public  Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, double altura, double peso)
    {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    //Getters
    public String getNome()
    {
        return this.nome;
    }

    public String getNacionalidade()
    {
        return this.nacionalidade;
    }

    public String getCategoria()
    {
        return this.categoria;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public int getVitorias()
    {
        return this.vitorias;
    }

    public int getDerrotas()
    {
        return this.derrotas;
    }

    public int getEmpates()
    {
        return this.empates;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public double getPeso()
    {
        return this.peso;
    }

    //Setters
    public void setNome(String valor)
    {
        this.nome = valor;
    }

    public void setNacionalidade(String valor)
    {
        this.nacionalidade = valor;
    }

    private void setCategoria(double valor)
    {
        this.categoria = (valor < 52.2 || valor > 120.2) ? "Inválido" : valor <= 70.3 ? "Leve" : valor <= 89.9 ? "Médio" : "Pesado";
    }

    public void setIdade(int valor)
    {
        this.idade = valor;
    }

    public void setVitorias(int valor)
    {
        this.vitorias = valor;
    }

    public void setDerrotas(int valor)
    {
        this.derrotas = valor;
    }

    public void setEmpates(int valor)
    {
        this.empates = valor;
    }

    public void setAltura(double valor)
    {
        this.altura = valor;
    }

    public void setPeso(double valor)
    {
        this.peso = valor;
        this.setCategoria(valor);
    }

    //Métodos comuns
    public void apresentar()
    {
    	System.out.println("--------------------------------------------------");
    	System.out.println("Nome: " + this.getNome() + ".");
        System.out.println("Nacionalidade: " + this.getNacionalidade() + ".");
        System.out.println(this.getIdade() + " anos.");
        System.out.println(this.getAltura() + " M de altura.");
        System.out.println("Pesando: " + this.getPeso() + ".");
        System.out.println("Ganhou: " + this.getVitorias() + ".");
        System.out.println("Perdeu: " + this.getDerrotas() + ".");
        System.out.println("Empatou: " + this.getEmpates() + ".");
    }

    public void status()
    {
    	System.out.println("--------------------------------------------------");
    	System.out.println(this.getNome() + ".");
        System.out.println("É um peso " + this.getCategoria() + ".");
        System.out.println(this.getVitorias() + " vitórias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println(this.getEmpates() + " empates.");
    }

    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
}
