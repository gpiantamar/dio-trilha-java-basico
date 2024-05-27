package heranca;

public class ServicoMensagemInstantanea {
	public void enviarMensagem(){
		//primeiro verificar se há conexão da internet.
		validarConectadoInternet();
		System.out.println("Enviando mensagem.");
		//depois de enviada, salva o histórico da mensagem.
		salvarHistoricoMensagem();
	}
	public void receberMensagem(){
		System.out.println("Recebendo mensagem");
	}
	//métodos privados, visiveis somente na classe 
	private void validarConectadoInternet(){
		System.out.println("Validando se está conectado a internet");
	}

	private void salvarHistoricoMensagem(){
		System.out.println("Salvando o historico da mensagem");
	}
}
