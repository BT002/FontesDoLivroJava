package capituloXXIV;

public class MinhaExcecao extends Exception {
	@Override
	public String getMessage() {
		String mensagem = "Esse � o erro da exce��o customizada do " 
				          + "Capitulo V! \nOcorreu porque foi clicado o bot�o "
						  + "Salvar mas o campo Nome estava em branco";
		return mensagem;
	}
}


