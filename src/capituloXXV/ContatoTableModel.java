package capituloXXV;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ContatoTableModel extends AbstractTableModel{
	// nome das colunas da tabela
	private final String[] colunas = new String[] {"Código", "Nome", "Email"};
	// lista para a manipulação do objeto
	private List<Contato> listaContatos;
	public ContatoTableModel() {
		this.listaContatos = new ArrayList<Contato>();
	}
	public ContatoTableModel(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}
	// número de linhas
	public int getRowCount() {
		return this.listaContatos.size();
	}
	// número de colunas
	public int getColumnCount() {
		return this.colunas.length;
	}
	// define o que cada coluna conterá do objeto
	public Object getValueAt(int rowIndex, int columnIndex) {
		Contato c = this.listaContatos.get(rowIndex);
		switch(columnIndex) {
			 case 0:
				 return c.getId();
			 case 1:
				 return c.getNome();
			 case 2:
				 return c.getEmail();
			 default:
				 return null;
		}
	}
	// determina o nome das colunas
	@Override
	public String getColumnName(int column) {
		return this.colunas[column];
	}
	// determina que tipo de objeto cada coluna irá suportar
	@Override
	public Class<?> getColumnClass(int columnIndex){
		switch(columnIndex) {
		case 0:
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		default:
				return null;
		}
	}
}
