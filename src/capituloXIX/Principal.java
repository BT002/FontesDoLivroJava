package capituloXIX;

import capituloXV.Atleta;
import capituloXV.Time;


public class Principal {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta();
		atleta1.inserirDados();
		Time time = new Time();
		time.setCodigoTime(55);
		time.setNomeTime("Time X");
		time.setAtleta(atleta1);
		System.out.println("O time � " + time.getNomeTime());
		System.out.println("O nome do atleta �: " + time.getAtleta().getNome());
	}

}
