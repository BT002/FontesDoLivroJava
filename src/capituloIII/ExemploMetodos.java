package capituloIII;

public class ExemploMetodos {
	public static void escreverBoasVindas() {
		System.out.println("Ol� Pessoal");
		System.out.println("Bem Vindos ao Curso de Java...");
	}
	public static void listarChamada() {
		System.out.println("Est�o presentes os cursisteas:");
		System.out.println("J�o\nMaria\nPedro\nGilberto\nIsabela");
	}
	public static void main(String[] args) {
		escreverBoasVindas();
		int i = 10;
		listarChamada();
		// Se chegarem mais alunos, ser�o novamente saudados
		escreverBoasVindas();
		// Um m�todo pode ser chamado quantas vezes forem necess�rias
	}
}

