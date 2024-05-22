import java.util.Random;
public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		do{
			System.out.println("Telefone tocando");
		}while(tocando());
	}
	private static boolean tocando(){
		String fala = "......";
		boolean atendeu = new Random().nextInt(3)==1;
		//se o valor aleatorio cair em 1 -> não está tocando
		if(atendeu){
			fala = "Alô";
			System.out.println("Atendeu? " + fala);
			
		}else{
			System.out.println("Atendeu? " + fala);
		}
		
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
