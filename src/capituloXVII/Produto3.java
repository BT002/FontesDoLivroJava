package capituloXVII;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto3 {

	private int codigo;
	private double preco;
	private String descricao;

	public double calcularFrete(int km) {
		double valor = km * 1.05;
		return valor;
	}

	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite a descrição do produto:"));
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:"));
	}
	
	@Override
	public String toString() {
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		String texto = "Este produto é um " + this.descricao + ", possui o código " + this.codigo + " e custa "
				+ formatar.format(this.preco);
		return texto;
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

}
