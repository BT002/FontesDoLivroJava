package capituloXVII;

public class TesteSobrescrita {
	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		Atleta corredor = new Corredor();
		atleta.setValorPatrocinio(1000);
		corredor.setValorPatrocinio(1000);
		int percentAumento = 15;
		// O mesmo percentual de autmento na chamada dos dois objetos
		atleta.atualizarValor(percentAumento);
		corredor.atualizarValor(percentAumento);
		// Porém com resultadois diferentes
		System.out.println("Novo salário de atleta"+ atleta.getValorPatrocinio());
		System.out.println("Novao salário de corredor: " + corredor.getValorPatrocinio());
	}
}

