import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        int numero = sc.nextInt();
        System.out.println("Informe a agência: ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Informe seu nome completo: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Informe seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente+ ", obrigado por criar uma conta em nosso banco.\nA sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}
