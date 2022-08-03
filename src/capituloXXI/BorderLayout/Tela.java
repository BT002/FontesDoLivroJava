package capituloXXI.BorderLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame {
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir;
	private JPanel painel, subPainelNome, subPainelEmail;

	public Tela(String titulo) {
		super(titulo);
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnExibir = new JButton("Exibir");
		painel = new JPanel();
		subPainelNome = new JPanel();
		subPainelEmail = new JPanel();
		// BorderLayout() � o gerenciador de layout
		// que trabalha a posi��o dos objetos em regi�es:
		// leste, oeste, norte, sul e centro
		painel.setLayout(new BorderLayout());
		/* Na chamada ao construtor desse Gerenciador de Layout s�o informados os
		 * n�meros de linha (primeiro) e colunas (depois da v�rgula */
		painel.setLayout(new BorderLayout());
		subPainelNome.setLayout(new FlowLayout());
		subPainelNome.add(lblNome);
		subPainelNome.add(txtNome);
		painel.add(subPainelNome, BorderLayout.NORTH);
		subPainelEmail.setLayout(new FlowLayout());
		subPainelEmail.add(lblEmail);
		painel.add(subPainelEmail, BorderLayout.SOUTH);
		painel.add(btnSalvar, BorderLayout.EAST);
		painel.add(btnExibir, BorderLayout.WEST);
		painel.add(new JLabel("********Regi�o Central********"),BorderLayout.CENTER);
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Tela tela = new Tela("Tela organizada em Grid");
	}
}


