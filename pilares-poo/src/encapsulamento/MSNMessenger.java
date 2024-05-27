package encapsulamento;

public class MSNMessenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}

	//Pedrinho não precisa ver.
	private void validarConectadoInternet() {
		System.out.println("Validando internet");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico");
	}
}
