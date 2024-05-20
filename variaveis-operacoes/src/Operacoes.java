package aulas;
public class Operacoes {
	public static void main(String[] args) {
		String nome = "Guilherme";
		int idade = 20;
		double peso = 78.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		int dataNascimento = 2004;

		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso );
		System.out.println("Sexo: " + sexo + "\nDoador: " + doadorOrgao + "\nData nascimento: " + dataNascimento);

		int numero = 5;

		System.out.println(++numero);//Incrementa primeiro antes de imprimir(5+1) Ambos incrementa à variável 1.
		System.out.println(--numero);//Decrementa primeiro ntes de imprimir(5-1).

		numero += 10;//Soma o numero + 10 ->Incrementado
		//ou
		numero = numero + 10;//Soma o numero + 10 ->Normal

		System.out.println(numero);

		boolean variavel = true;
		System.out.println(variavel);
		variavel = !variavel;
		System.out.println(variavel);

	}
}