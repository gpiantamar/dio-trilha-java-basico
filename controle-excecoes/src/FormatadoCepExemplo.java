public class FormatadoCepExemplo {
	public static void main(String[] args) {
		try {
			String cepFormatado = FormataCep("14-790-0");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("O cep não corresponde as regras de negócio");
		}
	}
	static String FormataCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8){
			throw new CepInvalidoException();

			//simulando um cep formatado
		}
		return "14-790-0";
	}
}
