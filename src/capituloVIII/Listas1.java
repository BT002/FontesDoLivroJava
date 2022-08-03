package capituloVIII;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Nome e sobrenome");
		lista.add(3003.32);
		System.out.println("Lista com elementos diferenes: " + lista);
		
		lista.clear();
		System.out.println("Lista escaziada: " + lista);
	}

}
