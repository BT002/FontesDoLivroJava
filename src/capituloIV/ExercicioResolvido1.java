package capituloIV;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		int soma=0;
		int contador=0;
		int media=0;
		while(contador<10) {
			contador = contador +1;
			soma = soma + contador;
			System.out.println("Laço: " + contador + "Soma = " + soma);
		}
		media = soma / contador;
		System.out.println("A soma dos 10 primeiros números: " + soma);
		System.out.println("A média dos 10 primeiros números: " + media);
	}
}


