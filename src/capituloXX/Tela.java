package capituloXX;

import java.awt.*;


public class Tela extends Frame{
	private Label lblNome, lblEmail;
	private TextField txtNome, txtEmail;
	private Button btnSalvar, btnExibir;
	private Panel painel;
	
	public Tela(String titulo) {
		super(titulo);
		lblNome = new Label("Nome: ");
		lblEmail = new Label("Email: ");
		txtNome = new TextField(20);
		txtEmail = new TextField(20);
		btnSalvar = new Button("Salvar");
		btnExibir = new Button("Exibir");
		painel = new Panel();
		// FlowLayout() � o gerenciamento de Layout padr�o
		// � ele que � assumido quando nenhum gerenciamento for escolhido
		// Ele coloca os objetos em uma linha
		painel.setLayout(new FlowLayout());
		painel.add(lblNome);
		painel.add(lblEmail);
		painel.add(txtNome);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		this.add(painel);
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela("Segundo Livro");
		tela.setVisible(true);
	}
}



