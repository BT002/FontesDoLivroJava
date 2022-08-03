package capituloXXV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class TrabalharXML {
	public static void lerXML() throws JDOMException, IOException {
		File f = new File("C:\\capituloXXIV\\gera.xml");
		SAXBuilder sb = new SAXBuilder();
		Document d = sb.build(f);
		Element raiz = d.getRootElement();
		List elements = raiz.getChildren();
		Iterator i = elements.iterator();
		Contato meuContato = null;
		while (i.hasNext()) {
			Element element = (Element) i.next();
			System.out.println("ID: " + element.getAttributeValue("id"));
			System.out.println("Nome: " + element.getChildTextTrim("nome"));
			System.out.println("Email: " + element.getChildTextTrim("email"));
			// Cria o objeto do tipo Contato();
			meuContato = new Contato();
			// Popula o objeto:
			meuContato.setId(Integer.parseInt(element.getChildTextTrim("nome")));
			meuContato.setNome(element.getChildTextTrim("nome"));
			meuContato.setEmail(element.getChildTextTrim("email"));
			Contato.adiciona(meuContato);
			// Desfaz o objeto meuContato:
			meuContato = null;
		}
	}
	public static void escreverXML() throws IOException{
		/* Declaração dos elementos que irão compor a estrutura do documento */
		Element raiz = new Element("raiz");
		Element contato = null;
		Element nome = null;
		Element email = null;
		int id = 0;
		// Passado por todos os contatos e gravando
		List<Contato> listacont = Contato.getMinhaLista();
		for (Contato c: listacont) {
			contato = new Element("contato");
			nome = new Element("nome");
			email = new Element("email");
			// "Setando" os atributos
			contato.setAttribute("id", String.valueOf(++id));
			nome.addContent(c.getNome());
			contato.addContent(nome);
			email.addContent(c.getEmail());
			contato.addContent(email);
			raiz.addContent(contato);
			contato = null;
			nome = null;
			email = null;
		}
		// Criando o documento XML (montado)
		Document doc = new Document();
		doc.setRootElement(raiz);
		// Omprimindo o XML
		XMLOutputter xout = new XMLOutputter();
		FileOutputStream fos = new FileOutputStream("C:\\capituloXXIV\\gera.xml");
		PrintStream ps = new PrintStream(fos);
		// Gravando...
		xout.output(doc, ps);
	}
}

