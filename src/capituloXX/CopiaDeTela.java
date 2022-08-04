package capituloXX;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CopiaDeTela extends JFrame{
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;
	private JPanel painel;
	
	public CopiaDeTela(String titulo) {
		super(titulo);
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnExibir = new JButton("Exibir");
		painel = new JPanel();
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
		CopiaDeTela tela = new CopiaDeTela("Segundo Livro");
		tela.setVisible(true);
	}
}




