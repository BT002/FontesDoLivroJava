package capituloIII;

public class Exemplo2 {

	// Método público que realiza a soma;
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// Método público que realiza a subtração
	public static int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 5;
		// CHamada do método somar e respectiva atribuição do retorno à
		// variável resultadoSoma
		int resultadoSoma = somar(numero1, numero2);
		// Chamada de método subtrair e respectiuva atribuição do 
		// retorno à variável resultadoSubtracao
		int resultadoSubtracao = subtrair(numero1, numero2);
		System.out.println("Resultados:");
		System.out.println("Soma: " + resultadoSoma);
		System.out.println("Subtração: " + resultadoSubtracao);
	}
}
