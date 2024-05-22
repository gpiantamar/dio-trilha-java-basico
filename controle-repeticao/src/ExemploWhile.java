import java.util.Random;//Simula valores aleatórios
public class ExemploWhile {
public static void main(String[] args) {
    Random gerador = new Random();
	int mesada = 50;
        while(mesada>0) {
            int valorDoce = valorAleatorio(gerador);
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static int valorAleatorio(Random gerador) {
    int valor = gerador.nextInt(30);
	return valor;
   }
}
