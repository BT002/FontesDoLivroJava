package capituloXXV;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdom2.JDOMException;


public class Principal extends JDialog implements ActionListener{
	private JFrame frame;
	private JMenuBar barraMenu;
	private JMenu menuExibir;
	private JMenuItem menuTabela;
	private JLabel lblId, lblNome, lblEmail;
	private JTextField txtId, txtNome, txtEmail;
	private JButton btnSalvar, btnExibir, btnLimpar, btnVoltar, btnImportar, btnExportar;
	private JPanel painel;
	private boolean verificarEmail() {
		boolean resp = false;
		if(txtEmail.getText().contains("@")) {
			resp = true;
		}
		return resp;
	}
	public Principal(JFrame frame, String titulo, boolean modal) {
		super(frame, titulo, modal);
		// criando a janela como JDialog e colocando true em modal,
		// fica impossível retornar ao menu sem fechar essa janela
		barraMenu = new JMenuBar();
		menuExibir = new JMenu("Exibir");
		menuTabela = new JMenu("Tabela");
		menuTabela.addActionListener(this);
		barraMenu.add(menuTabela);
		this.setJMenuBar(barraMenu);
		lblId = new JLabel("Códgio: ");
		lblNome = new JLabel("Nome: ");
		lblEmail = new JLabel("Email: ");
		txtId = new JTextField(5);
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(this);
		btnImportar = new JButton("Importar XML");
		btnImportar.addActionListener(this);
		btnExportar = new JButton("Exportar XML");
		btnExportar.addActionListener(this);
		painel = new JPanel();
		painel.setLayout(new GridLayout(5, 2));
		painel.add(lblId);
		painel.add(txtId);
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);
		painel.add(btnExibir);
		painel.add(btnLimpar);
		painel.add(btnVoltar);
		painel.add(btnImportar);
		painel.add(btnExportar);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(painel,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100,100);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Contato meuContato=null;
		if(e.getSource()==menuTabela) {
			if(ptab==null) {
				ptab = new TabelaContatos(this.frame,"Capitulo capituloXXV", true);
			}else {
				ptab.setVisible(true);
			}
		}else if(e.getSource() == btnExibir) {
			JOptionPane.showMessageDialog(this, Contato.getMinhaLista());
		}else if(e.getSource() == btnSalvar){
			// No caso de haver clicado em Salvar
			// Criar objeto do tipo contato:
			meuContato = new Contato();
			// Popula o objeto
			meuContato.setId(Integer.parseInt(txtNome.getText()));
			meuContato.setNome(txtNome.getText());
			meuContato.setEmail(txtEmail.getText());
			// Adiciona à lista de Contatos
			if(!txtNome.getText().isEmpty()) {
				if(verificarEmail()) {
					Contato.adiciona(meuContato);
					JOptionPane.showMessageDialog(this, "Contato: " + txtNome.getText() + " adicionado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(this, "Esse email não é válido. Contato não adicionado.");
				}
			}
			// Desfaz o objeto meuContato:
			meuContato = null;
		}
		else if(e.getSource()==btnLimpar) {
			txtId.setText(null);
			txtNome.setText(null);
			txtEmail.setText(null);
		}
		else if(e.getSource()==btnVoltar) {
			int confirma = JOptionPane.showConfirmDialog(this, "Quer excluir os contatos?", "Capítulo capituloXXV", JOptionPane.YES_NO_OPTION);
			if(confirma==JOptionPane.YES_OPTION) {
				Contato.limpar();
		}
		this.setVisible(false);
		}
		else if(e.getSource() == btnImportar) {
			System.out.println("Implementar importação");
			try {
				TrabalharXML.lerXML();
			} catch (JDOMException e1) {
				System.out.println("Exceção ao trabalhar com XML " + e1.getMessage());
			} catch (IOException e1) {
				System.out.println("Exceção ao trabalhar com Operação de Entrada/Saída: " + e1.getMessage());
			}
		}
		else if(e.getSource()==btnExportar) {
			System.out.println("Implementar Exportação");
			try {
				TrabalharXML.escreverXML();
			} catch (Exception e1) {
				System.out.println("Exceção ao trabalhar com Operação de Entrada/Saída: " + e1.getMessage());
			}
		}
	}
}
