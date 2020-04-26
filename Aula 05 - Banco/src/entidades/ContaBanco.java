package entidades;

public class ContaBanco {
	
    //Atributos
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Constructor
    public ContaBanco()
    {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Setters
    public void setNumConta(String newNumConta)
    {
        this.numConta = newNumConta;
    }

    public void setTipo(String newTipo)
    {
        this.tipo = newTipo;
    }

    public void setDono(String newDono)
    {
        this.dono = newDono;
    }

    public void setSaldo(double newSaldo)
    {
        this.saldo = newSaldo;
    }

    public void setStatus(boolean newStatus)
    {
        this.status = newStatus;
    }

    //Getters
    public String getNumConta()
    {
        return this.numConta;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public String getDono()
    {
        return this.dono;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public boolean getStatus()
    {
        return this.status;
    }

    //Métodos Personalizados

    public void abrirConta(String tipo) {
    	this.setTipo(tipo);
    	this.setStatus(true);
    	this.setSaldo(tipo.equals("cc") ? 50 : tipo.equals("cp") ? 150 : 0);
    	System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
    	if(this.saldo != 0)
    	{
    		System.out.println(this.saldo > 0 ? "Conta com dinheiro" : "Conta em débito");
    	}
    	else
    	{
    		this.setStatus(false);
    		System.out.println("Conta fechada com sucesso!");
    	}
    }

    public void depositar(double deposito) {
    	if(this.getStatus())
    	{
    		this.setSaldo(this.getSaldo() + deposito);
    		System.out.println("Depósito relizado com sucesso na conta de " + this.getDono());
    	}
    	else
    	{
    		System.out.println("Impossível depositar em uma conta fechada!");
    	}
    }

    public void sacar(double saque) {
    	if(this.getStatus() && saque <= this.getSaldo())
    	{
    		this.setSaldo(this.getSaldo() - saque);
    		System.out.println("Saque relizado com sucesso na conta de " + this.getDono());
    	}
    	else
    	{
    		String msg = "[ERRO] ";
    		msg += !this.getStatus() ? "Está conta está fechada!" : saque > this.getSaldo() ? "O valor ultrapassa o saldo" : "" ;
    		System.out.println(msg);
    	}
    }

    public void pagarMensal() {
    	double mensal = this.getTipo().equals("cc") ? 12 : 20;

    	if(this.getStatus())
    	{
    		this.setSaldo(this.getSaldo() - mensal);
    	}
    	else
    	{
    		System.out.println("Impossível pagar a mensalidade!");
    	}
    }

    public void statusAtual() {
    	System.out.println("--------------------------------------------------");
    	System.out.println("Número da conta: " + this.getNumConta());
    	System.out.println("Tipo: " + this.getTipo());
    	System.out.println("Dono: " + this.getDono());
    	System.out.println("Saldo: " + this.getSaldo());
    	System.out.println("Status da conta: " + this.getStatus());
    }
}
