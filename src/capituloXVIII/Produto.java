package capituloXVIII;

public class Produto {
	private int codigo;
	private double preco;
	private String descricao;
	private double frete;

	public void calcularFrete(char regiao) {
		switch (regiao) {
		case 'I':
			System.out.println("Regi�o para Entrega: Interior");
			this.frete = 100;
			break;
		case 'M':
			System.out.println("Regi�o para Entrega: Metropolitana");
			this.frete = 0;
			break;
		case 'L':
			System.out.println("Regi�o para Entrega: Litoral");
			this.frete = 20;
			break;
		default: 
			System.out.println("Por favor informe: (I) Interior, (M) Metropolitana ou (L) Litoral");
			break;
		}
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

}
