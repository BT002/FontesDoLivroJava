package capituloXXIII;

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
	private JMenuBar barraMenu; // Essa � a barra de Menu
	// Em seguida os pr�prios menus
	private JMenu menuCadastro, menuSobre;
	// Aqui s�o declarados os subitens dos menus, que depois
	// ser�o adicionados aos respectivos menus
	private JMenuItem menuContatos, menuSair;
	private Principal pcontatos = null;
	public Menu(String titulo) {
		super(titulo); /* aqui � a chamada ao construtor da 
		superclasse, deve ser a primeira instru��o do construtor */
		this.setBounds(100, 100, 456, 112);
		iniciar();
	}

	private void iniciar() {
		// Instaciando os objetos:
		barraMenu = new JMenuBar();
		menuCadastro = new JMenu("Cadastro");
		menuContatos = new JMenuItem("Contatos");
		menuSair = new JMenuItem("Sair");
		menuSobre = new JMenu("Sobre");
		// Agora s�o adicionados os listeners respectivamente
		menuCadastro.addMenuListener(this);
		menuContatos.addActionListener(this);
		menuSair.addActionListener(this);
		menuSobre.addActionListener(this);
		menuCadastro.add(menuSair);
		menuCadastro.add(menuCadastro);
		barraMenu.add(menuCadastro);
		barraMenu.add(menuContatos);
		// � configurada a barra de Menu
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Menu("Menu da Aplica��o").setVisible(true);
		/** aqui � instaciado o objeto do tipo Menu,
		 * o que � suficiente para abrir a janela,
		 * passado o t�tulo da mesma e configurando o
		 * modo de exibi��o como true
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* Se for clicando o item Contatos, ent�o � testado
		 * se j� estpa criado o objeto da janela Principal e,
		 * se j� estiver criado apenas � tornado visivel
		 * sen�o � criado (instanciado)
		 */
		if(e.getSource() == menuContatos) {
			if(pcontatos == null) {
				pcontatos = new Principal(this, "Capitulo XXXII", true);
			}else {
				pcontatos.setVisible(true);
			}
		}else {
			if(e.getSource() == menuSair) {
				System.exit(0);
			}
		}
	}
	
	@Override
	public void menuCanceled(MenuEvent e) {
		/* Aqui seria a programa��o que atenderia o presente evento.
		 * Foi criado esse m�todo para atender � necessidade de implementar
		 * todos os m�todos abstratos da interface MenuListener */
	}
	
	@Override
	public void menuDeselected(MenuEvent e) {
		/* Esse c�digo acontece quando o menu
		 * "perde" o foco que estava sobre ele
		 */
		if(e.getSource() == menuCadastro) {
			System.out.println("menu cadastro desselecionado");
		}else {
			System.out.println("menu sobre desselecionado");
		}
	}
	
	@Override
	public void menuSelected(MenuEvent e) {
		/* Aqui s�o trabalhados os eventos de clique nos Menus
		 * propriamente ditos. Observe que aqui s� s�o exemplo
		 * apenas estamos exibindo mensagens com fins did�ticos
		 */
		if(e.getSource() == menuCadastro) {
			/* aqui podem ser instanciadas e chamadas outras
			 * janelas (filhas de JFrame) mas nesse exemplo
			 * apenas estamos exibindo mensagens com fins did�ticos
			 */
			System.out.println("Menu Cadastro acionado");
		}else if(e.getSource() == menuSobre){
			System.out.println("Menu Sobre acionado");
			JOptionPane.showInternalMessageDialog(this, "Cr�ditos Java Avan�ado");
		}
	}

}
