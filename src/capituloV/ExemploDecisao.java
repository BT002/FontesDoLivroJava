package capituloV;

public class ExemploDecisao {

	public static void main(String[] args) {
		String nome = "João";
		int idade = 18; // supondo que o usuário digite 18
		if(idade < 10) {
			System.out.println(nome + " é menor e criança");
		}
		else if(idade < 18) {
			System.out.println(nome + " é menor e adolescente");
		}
		else {
			System.out.println(nome + " é maior e adulto");
		}
	}
}

