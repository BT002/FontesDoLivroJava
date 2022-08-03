package capituloV;


public class ExemploDecisao4 {

	public static void main(String[] args) {
		char letra = 'x';
		switch(letra) {
		case 'c': System.out.println("letra c");
		break;
		case 'p': System.out.println("letra p");
		break;
		case 'u': System.out.println("letra u");
		default: System.out.println("Opção não disponível");
		System.out.println("Não foram escolhidas 'c' 'p'p nem 'u'");
		
		javax.swing.JOptionPane.showMessageDialog(null, "Olá m");
		javax.swing.JOptionPane.showInputDialog("Oi");
		
		}
	}
}



