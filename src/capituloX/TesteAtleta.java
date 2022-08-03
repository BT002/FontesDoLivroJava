package capituloX;

public class TesteAtleta {

/* Primeira explicação
	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		atleta.codigo = 10;
		atleta.nome = "Joaquim";
		atleta.esporte = "Atletismo";
		System.out.println("Objetivo atleta criado a partir de classe Atleta");
		System.out.println("Código: " + atleta.codigo);
		System.out.println("Nome: "+ atleta.nome);
		System.out.println("Esporte: " + atleta.esporte);
		System.out.println("Valor de Patrpcínio: R$ " + atleta.valorPatrocinio);
	}
*/
	
	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		atleta.inserirDados();
		atleta.atualizarValor(20);
		atleta.mostar();
	}
}


