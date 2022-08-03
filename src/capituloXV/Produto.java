package capituloXV;

public class Produto {
	private int codigo;
	private double preco;
	private String descricao;
	private double frete;
	private DataFrabricacao dtFrabr;
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
	public DataFrabricacao getDtFrabr() {
		return dtFrabr;
	}
	public void setDtFrabr(DataFrabricacao dtFrabr) {
		this.dtFrabr = dtFrabr;
	}
	
	
}
