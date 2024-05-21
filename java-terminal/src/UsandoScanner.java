import java.util.Scanner;
import java.util.Locale;
public class UsandoScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite seu nome: ");
		String nome = sc.next();

		System.out.println("Digite seu sobrenome: ");
		String sobreNome = sc.next();

		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();

		System.out.println("Digite a idade: ");
		int idade = sc.nextInt();

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobreNome + "\nAltura: " + altura + "cm" + "\nIdade: " + idade);

		sc.close();
	}
}
