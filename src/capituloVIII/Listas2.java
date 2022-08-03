package capituloVIII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Listas2 {

	public static void main(String[] args) {
		List lista = new ArrayList();
		JOptionPane.showInternalMessageDialog(null, "Exemplo de ordenação de uma ArrayList");
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		System.out.println("Lista como foi digitada: " + lista);
		
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista);
	}
}

