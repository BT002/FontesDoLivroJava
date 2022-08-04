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
	private JMenuBar barraMenu; // Essa é a barra de Menu
	// Em seguida os próprios menus
	private JMenu menuCadastro, menuSobre;
	// Aqui são declarados os subitens dos menus, que depois
	// serão adicionados aos respectivos menus
	private JMenuItem menuContatos, menuSair;
	private Principal pcontatos = null;
	public Menu(String titulo) {
		super(titulo); /* aqui é a chamada ao construtor da 
		superclasse, deve ser a primeira instrução do construtor */
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
		new Menu("Menu da Aplicação").setVisible(true);
		/** aqui é instaciado o objeto do tipo Menu,
		 * o que é suficiente para abrir a janela,
		 * passado o título da mesma e configurando o
		 * modo de exibição como true
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* Se for clicando o item Contatos, ent�o � testado
		 * se já está criado o objeto da janela Principal e,
		 * se já estiver criado apenas é tornado visivel
		 * senão é criado (instanciado)
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
		/* Aqui seria a programação que atenderia o presente evento.
		 * Foi criado esse m�todo para atender é necessidade de implementar
		 * todos os m�todos abstratos da interface MenuListener */
	}
	
	@Override
	public void menuDeselected(MenuEvent e) {
		/* Esse código acontece quando o menu
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
		/* Aqui são trabalhados os eventos de clique nos Menus
		 * propriamente ditos. Observe que aqui só são exemplos
		 * apenas estamos exibindo mensagens com fins didáticos
		 */
		if(e.getSource() == menuCadastro) {
			/* aqui podem ser instanciadas e chamadas outras
			 * janelas (filhas de JFrame) mas nesse exemplo
			 * apenas estamos exibindo mensagens com fins didáticos
			 */
			System.out.println("Menu Cadastro acionado");
		}else if(e.getSource() == menuSobre){
			System.out.println("Menu Sobre acionado");
			JOptionPane.showInternalMessageDialog(this, "Créditos Java Avançado");
		}
	}

}
