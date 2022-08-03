package capituloXVII;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {
	public int codigo;
	public String nome;
	public String esporte;
	public double valorPatrocinio;
	
	public double atualizarValor(double taxa) {
		this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa/100);
		return this.valorPatrocinio;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo:"));
		this.nome = JOptionPane.showInputDialog("Didgite o nome:");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado:");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Patroc�nio"));
	}

	public void mostar() {
		String mensagem = "Objeto atleta criado a partie de classe Atleta";
		mensagem += " \nC�digo: " + this.codigo;
		mensagem += " \nNome: " + this.nome;
		mensagem += " \nEsporte: " + this.esporte;
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor de Patroc�nio: " + formatar.format(this.valorPatrocinio);
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public double getValorPatrocinio() {
		return valorPatrocinio;
	}

	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	
}



