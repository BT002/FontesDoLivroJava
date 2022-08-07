package capituloII;

import java.awt.List;
import java.awt.*;


/*
 Exemplo do Javadoc
 Respos�vel pelo sistema
 Diego de Mirandiba
 */

// Classe principal

/** Classe Principal do capitulo 2*/
public class Principal {

	/** M�todo principal main*/
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
		
		boolean restituicao = true;
		if(restituicao) {
			System.out.println("Receber restituição");
		}else {
			System.out.println("Não Receber restituição");
		}
		
	}
}


