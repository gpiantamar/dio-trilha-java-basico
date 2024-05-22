public class ExemploFor {
	public static void main(String[] args) {
		/*Estrutura 1 
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
		System.out.println("Joãozinho dormiu!!");
		*/
		/*Estrutura 2 */
		int carneirinhos = 1;
		for( ; carneirinhos <=20; ) {
     		System.out.println(carneirinhos + " - Carneirinho(s)");
     		carneirinhos ++;
		}
		System.out.println("Joãozinho dormiu!!");
	}
}