package capituloIII;

public class Exemplo2 {

	// M�todo p�blico que realiza a soma;
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// M�todo p�blico que realiza a subtra��o
	public static int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 5;
		// CHamada do m�todo somar e respectiva atribui��o do retorno �
		// vari�vel resultadoSoma
		int resultadoSoma = somar(numero1, numero2);
		// Chamada de m�todo subtrair e respectiuva atribui��o do 
		// retorno � vari�vel resultadoSubtracao
		int resultadoSubtracao = subtrair(numero1, numero2);
		System.out.println("Resultados:");
		System.out.println("Soma: " + resultadoSoma);
		System.out.println("Subtra��o: " + resultadoSubtracao);
	}
}
