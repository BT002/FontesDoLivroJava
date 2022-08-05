package capituloII;

import java.awt.List;
import java.awt.*;


public class Principal {

	public static void main(String[] args) {

		int num;            // Apenas declarada e não inicializada
		
		num = 0;            // Variável inicializada
		
		int numero = 0;     // Variável declarada e inicializada 
		
		String nome = "Silvio Santos";
		int idade   = 83;
		
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
	
		
		System.out.println(num);
		System.out.println(numero);
		
		boolean restitui��o = true;
		if(restitui��o) {
			System.out.println("Receber restituição");
		}else {
			System.out.println("Não Receber restituição");
		}
		
	}
}


