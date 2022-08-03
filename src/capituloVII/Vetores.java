package capituloVII;

import javax.swing.JOptionPane;

public class Vetores {

	public static void main(String[] args) {
		int[] idades = new int[6];
		String[] respostas = {"SIM", "sim"};
		for (int i = 0; i < 6; i++) {
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as idades"));
			if(i != 5) {
				String pergunta = JOptionPane.showInputDialog("Deseja Continuar?");
				if(!(pergunta.equals(respostas[0]) || pergunta.contentEquals(respostas[1]))){
					break;
				}
			}
		}
	}
}


