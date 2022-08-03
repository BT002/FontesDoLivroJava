package capituloXIV;

import capituloX.Atleta;

public class Corredor extends Atleta {

	public double atualizarValor(double taxa) {
		return super.atualizarValor(2*taxa);
	}
	
	private double velocidadeMedia;
	private double velocidadeMedia() {
		return this.velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
}
