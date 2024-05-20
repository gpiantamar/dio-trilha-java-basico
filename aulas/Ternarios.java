package aulas;

public class Ternarios {
	public static void main(String[] args) throws Exception{
		int a, b, c, d;
		String resultado = "";
		a = 5; 
		b = 6;
		c = 3;
		d = 3;
		/*Exemplo condicional usando uma estrtutura if e eslse */
		if(a == b){
			resultado = "Verdadeiro";
		}
		else{
			resultado = "Falso";
		}
		System.out.println(resultado);

		/*Exemplo usando operador ternário */

		resultado = c == d ?"Verdadeiro": "Falso";//Primeira operção tem q ser boleana.(1)-true e (0)-false
		//Com duas alternativas de resultado.
		System.out.println(resultado);
	}
}
