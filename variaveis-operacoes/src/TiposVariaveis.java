package aulas;


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Variáveis em JAVA
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;
        System.out.println("Variáveis");
        System.out.println("byte: " + idade + "\nshort: " + ano + "\nint: " + cep + "\nlong: " + cpf + "\npi: " + pi + "\nsalario: " + salario);

        System.out.println("Constantes");
        //CONSTANTES em JAVA
        final double valorPi = 3.14;
        System.out.println(valorPi);
    }
}