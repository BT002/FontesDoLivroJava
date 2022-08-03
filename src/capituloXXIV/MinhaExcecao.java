package capituloXXIV;

public class MinhaExcecao extends Exception {
	@Override
	public String getMessage() {
		String mensagem = "Esse é o erro da exceção customizada do " 
				          + "Capitulo V! \nOcorreu porque foi clicado o botão "
						  + "Salvar mas o campo Nome estava em branco";
		return mensagem;
	}
}


