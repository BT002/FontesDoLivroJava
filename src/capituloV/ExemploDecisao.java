package capituloV;

public class ExemploDecisao {

	public static void main(String[] args) {
		String nome = "Jo�o";
		int idade = 18; // supondo que o usu�rio digite 18
		if(idade < 10) {
			System.out.println(nome + " � menor e crian�a");
		}
		else if(idade < 18) {
			System.out.println(nome + " � menor e adolescente");
		}
		else {
			System.out.println(nome + " � maior e adulto");
		}
	}
}

