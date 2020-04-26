package entidades;
import interfaces.Controlador;

public class ControleRemoto implements Controlador {
	//Atributos
	private int volume;
	private boolean ligado, tocando;

	//Constructor
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	//Getters
	private int getVolume() {
		return this.volume;
	}

	private boolean isLigado() {
		return this.ligado;
	}

	private boolean isTocando() {
		return this.tocando;
	}

	//Setters
	private void setVolume(int valor) {
		this.volume = valor;  
	}

	private void setLigado(boolean valor) {
		this.ligado = valor;
	}

	private void setTocando(boolean valor) {
		this.tocando = valor;
	}

	//Sobrescrevendo Métodos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {	
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.print("Volume: " + this.getVolume());

		for(int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print(" | ");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu...");
	}

	@Override
	public void aumentarVolume() {
		this.setVolume( this.isLigado() ? this.getVolume() + 5 : this.getVolume() );
	}

	@Override
	public void abaixarVolume() {
		this.setVolume( this.isLigado() ? this.getVolume() - 5 : this.getVolume() );
	}

	@Override
	public void ligarMudo() {
		this.setVolume( this.isLigado() && this.getVolume() > 0 ? 0 : this.getVolume() );
	}

	@Override
	public void desligarMudo() {
		this.setVolume( this.isLigado() && this.getVolume() == 0 ? 50 : this.getVolume() );
	}

	@Override
	public void play() {
		this.setTocando(this.isLigado() && !this.isTocando() ? true : false);
	}

	@Override
	public void pause() {
		this.setTocando( this.isLigado() && this.isTocando() ? false : true );
	}
}