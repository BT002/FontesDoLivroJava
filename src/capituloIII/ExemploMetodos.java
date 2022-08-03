package capituloIII;

public class ExemploMetodos {
	public static void escreverBoasVindas() {
		System.out.println("Olá Pessoal");
		System.out.println("Bem Vindos ao Curso de Java...");
	}
	public static void listarChamada() {
		System.out.println("Estão presentes os cursisteas:");
		System.out.println("Jão\nMaria\nPedro\nGilberto\nIsabela");
	}
	public static void main(String[] args) {
		escreverBoasVindas();
		int i = 10;
		listarChamada();
		// Se chegarem mais alunos, serão novamente saudados
		escreverBoasVindas();
		// Um método pode ser chamado quantas vezes forem necessárias
	}
}

