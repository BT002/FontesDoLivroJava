package capituloXVII;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CarrinhoCompras2 {
	
	private List<Produto3> listaProd = new ArrayList<Produto3>();
	
	public void adicionar(Produto3 prod) {
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos quilometos para entregar?"));
		JOptionPane.showInternalMessageDialog(null, "Frete para o produto " + prod.getDescricao() + " é " + prod.calcularFrete(km));
		this.listaProd.add(prod);
	}
	
	public List<Produto3> gerarLista(){
		return this.listaProd;
	}
}
