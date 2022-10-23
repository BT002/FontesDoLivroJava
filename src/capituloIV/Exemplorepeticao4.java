package capituloIV;

import java.util.ArrayList;

public class Exemplorepeticao4 {
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Claytony");
		nomes.add("Alexsandro");
		nomes.add("Eduardo");
		nomes.add("Renato");
		
		for(int qtdNomes = 0;  qtdNomes < nomes.size(); qtdNomes++ ) {
			System.out.println(nomes.get(qtdNomes));
		}
		System.out.println("-----------------------");
		
		for (String nome_da_vez : nomes) {
			System.out.println(nome_da_vez);
		}
	}
}


