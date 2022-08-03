package capituloIV;

public class ExercicioResolvido2 {

	public static void main(String[] args) {
		int soma=0;
		int contador=0;
		int media=0;
		do {
			contador = contador + 1;
			soma = soma + contador;
			System.out.println("Laço: " + contador + " Soma = " + soma);
		} while(contador < 10);
		media = soma / contador;
		System.out.println("A soma dos 10 primeiros números: " + soma);
		System.out.println("A média dos 10 primeiros números: " + media);
	}
	
}








