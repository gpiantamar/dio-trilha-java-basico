package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		//Criamos uma pessoa no sistema
		//-------------------------> Informações obrigatórias ---> (importantes)
		Pessoa marcos = new Pessoa("123456789-10", "Marcos");

		//definimos o endereço de marcos
		marcos.setEndereco("Rua das Marias");

		//E como definir o nome e cpf do marcos?

		//imprimindo o marcos sem o nome e cpf

		System.out.println("Nome: " + marcos.getNome() + "\nEndereço: " + marcos.getEndereco() + "\nCpf: " + marcos.getCpf());
	}
}
