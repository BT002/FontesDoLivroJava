package capituloXXIII;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JDialog implements ActionListener{
	/*
	 * Aqui uma novidade: essa classe Principal é filha de 
	 * JDialog, postanto é uma JDialog, sendo essa uma
	 * opção do analista/programador
	 */
	private JLabel lblNome, lblEmail;
	private JTextField txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar;
	private JPanel painel;
	private boolean verificarEmail() {
		/*
		 * Esse método simboliza a verificação de email
		 * válido ou não. A única coisa que está fazendo
		 * é ver se tem o "@" nessa String capturada em 
		 * txtEmail.getText()
		 */
		boolean resp = false;
		if(txtEmail.getText().contains("@")) {
			resp = true;
		}
		return resp;
	}
	public Principal(JFrame frame, String titulo, boolean modal) {
		super(frame, titulo, modal);
		/*
		 * Aqui é muito importante observar que
		 * o construtor tem três argumentos. O boolean
		 * modal quando receber o valor true (verdadeiro)
		 * fará esta janela surgir após o Menu.java e então
		 * só será possível voltar à janela anterior (do Menu)
		 * se for fechada, impossibilitando o usuário final
		 * de chegar ao menu novamente sem sair do atual janela
		 */
		lblNome = new JLabel("Nome: ");
		txtNome = new JTextField(20);
		lblEmail = new JLabel("Email: ");
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(this);
		painel = new JPanel();
		painel.setLayout(new GridLayout(4, 2));
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		painel.add(btnLimpar);
		painel.add(btnVoltar);
		this.getContentPane().add(painel);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnExibir) {
			/*
			 * Se clicado o botão exibir, é aberta uma janela
			 * para exibir os contatos que estão na memória.
			 * São mostrados todos os contatos componentes da lista
			 * e cada um deles executa automaticamente o método
			 * toString() sobreposto em Contato.java para customizar a 
			 * exibição de seus atributos
			 */
		}else if(e.getSource() == btnSalvar){
			// no caso de haver clicado em Salvar;
			// Cria o objeto do tipo contato:
			Contato meuContato = new Contato();
			// Popula o objeto
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
			// Adiciona à lista de Contatos
			/*
			 * Se a caixa de texto não estiver vazia...
			 * (repare no carater de exclamação, que inverte
			 * o valor lógico retornado pelo método isEmpty
			 */
			if(!txtNome.getText().isEmpty()) {
				/*
				 * O contato somente será adicionado se o
				 * método verificarEmail() retornar verdadeiro
				 */
				if(verificarEmail()) {
					Contato.adiciona(meuContato);
					JOptionPane.showMessageDialog(this, "Contato: " + txtNome.getText() + " adicionado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(this, "Esse email não é válido. Contato não adicionado.");
				}
			}
			// Desfaz o objeto meuContato:
			meuContato = null;
		}else if(e.getSource() == btnLimpar){
			// Aqui são limpas as caixa de texto
			txtNome.setText(null);
			txtEmail.setText(null);
		}else if(e.getSource() == btnVoltar) {
			/*
			 * Quando o usuário clica no botão Voltar
			 * é perguntado se deseja excluir os contratos
			 * da memória (ainda não etilizamos banco de dados);
			 * Se sim (JOptionPane.YES_OPTION) então a lista é limpa
			 */
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos?", "Capitulo IV", JOptionPane.YES_NO_OPTION);
			if(confirma==JOptionPane.YES_OPTION) {
				Contato.limpar();
			}
			// Depois a janela é "escondida" nessa linha
			this.setVisible(false);
		}
	}

}
