
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
try -> permite que você dfina um bloco de código para ser 
testado quando a erros enquanto está sendo executado.
catch -> permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
finally -> permite definir um bloco de código a ser executado independente de ocorrer um erro ou não.
As palavras-chave try e catch vêm em pares.
 */
public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{
            //tente
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);//padrão
            
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobreNome = sc.next();
            
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            
            System.out.println("Informe a altura: ");
            double altura = sc.nextDouble();
            
            System.out.println("Olá " + nome.toUpperCase() + "" + sobreNome.toUpperCase() + ", você têm "
            + idade + " anos e " + altura + " cm de altura");
            
            sc.close();
        }
        catch(InputMismatchException e){
            //"captura" o erro e trata
            System.err.println("ERRO!\nOs campos idade e altura precisam ser numéricos");
        }
        }
    }
    