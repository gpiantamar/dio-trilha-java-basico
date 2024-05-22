public class ExemploBreakContinue {
	public static void main(String[] args) {
		//O comando break interrompe.
		//O comando continua prossegue.
		for(int numero = 1; numero <= 5; numero++){
			if(numero == 3){//Valor 3 foi desconsiderado.
				break;
			}
			System.out.println(numero);
		}

		for(int valor = 6; valor <= 10; valor++){
			if(valor == 8){//Vlor 8 foi desconsiderado.
				continue;
			}
			System.out.println(valor);
		}
	}
}
