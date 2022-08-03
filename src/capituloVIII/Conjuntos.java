package capituloVIII;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add(88);
		conjunto.add("Sobrenome e Nome");
		conjunto.add(3202.22);
		conjunto.add(99);
		System.out.println("Conte�do do conjunto: " + conjunto);
		if(conjunto.contains(88)) {
			System.out.println("O conjunto cont�m o inteiro 88");
		}
		System.out.println("Removendo o inteiro 88");
		conjunto.remove(88);
		if(conjunto.contains(88)) {
			System.out.println("O conjunto ainda cont�m o inteiro 88");
		}else {
			System.out.println("N�o cont�m mais o inteiro 88");
		}
		// Percorrendo o conjunto (n�o tem get(i))
		System.out.println("Criando o objeto interagir --> do tipo Iterator...");
		Iterator interagir = conjunto.iterator();
		while(interagir.hasNext()) {
			System.out.println(interagir.next());
		}
		// Nota: n�o aparecem na ordem em que foram inseridos
	}
}

