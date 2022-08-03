package capituloXVII;

public class Corredor extends Atleta {
	@Override
	public double atualizarValor(double taxa) {
		return super.atualizarValor(2 * taxa);
	}
	
	private double velocidadeMedia;

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	
}
