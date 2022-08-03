package capituloIV;

public class ExemploRepeticao2 {
	public static void main(String[] args) {
		int auxiliar=0; // primeiro declaramos a variável auxiliar
		do {
			System.out.println(auxiliar);
			auxiliar = auxiliar + 1;
		}
		while (auxiliar <=100000);
	}
}

