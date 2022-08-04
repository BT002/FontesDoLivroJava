package capituloXXV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu extends JFrame implements MenuListener, ActionListener{
	private JMenuBar barraMenu;
	private JMenu menuCadastro, menuSobre;
	private JMenuItem menuContatos, menuSair;
	private Principal pcontatos = null;
	public Menu(String titulo) {
		/* Essa linha abaixo � a chamada ao construtor
		 * da superclasse (JFrame), deve ser a primeira
		 * instru��o do construtor de Menu.java
		 */
		super(titulo);
		/* Arqui � configurada a posi��o e tamanha da janela */
		this.setBounds(100, 100, 456, 112);
		iniciar();
	}

	private void iniciar() {
		barraMenu = new JMenuBar();
		menuCadastro = new JMenu("Cadastro");
		menuContatos = new JMenuItem("Contatos");
		menuSair = new JMenuItem("Sair");
		menuSobre = new JMenu("Sobre");
		menuCadastro.addMenuListener(this);
		menuContatos.addActionListener(this);
		menuSair.addActionListener(this);
		menuSobre.addActionListener(this);
		menuCadastro.add(menuSair);
		menuCadastro.add(menuCadastro);
		barraMenu.add(menuCadastro);
		barraMenu.add(menuSobre);
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Menu("Menu da Aplicação").setVisible(true);
		/** aqui � instaciado o objeto do tipo Menu,
		 * passado o t�tulo da mesma e configurando o
		 * modo de exibi��o como true --> verdadeiro
		 */
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuContatos) {
			if(pcontatos == null) {
				pcontatos = new Principal(this, "Capitulo capituloXXV", true);
			}else {
				pcontatos.setVisible(true);
			}
		}else if(e.getSource() == menuSair) {
				System.exit(0);
		}
	}
	
	@Override
	public void menuCanceled(MenuEvent e) {
	}
	
	@Override
	public void menuDeselected(MenuEvent e) {
		if(e.getSource() == menuCadastro) {
			System.out.println("menu cadastro desselecionado");
		}else {
			System.out.println("menu sobre desselecionado");
		}
	}
	
	@Override
	public void menuSelected(MenuEvent e) {
		if(e.getSource() == menuCadastro) {
			System.out.println("Menu Cadastro acionado");
		}else if(e.getSource() == menuSobre){
			System.out.println("Menu Sobre acionado");
			JOptionPane.showInternalMessageDialog(this, "Créditos Java Avançado");
		}
	}
}
