package capituloXIX;

import java.util.ArrayList;
import java.util.List;

import capituloXVII.Produto2;

public class CarrinhoCompras {
	List<Produto2> listaProd  = new ArrayList<Produto2>();
	public void adicionar(Produto2 prod) {
		listaProd.add(prod);
	}
}

