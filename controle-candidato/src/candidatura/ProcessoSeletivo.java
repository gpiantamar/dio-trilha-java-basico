package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		String []candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos){
			entrandoEmContato(candidato);;
		}
	}

	public static void entrandoEmContato(String candidato){
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do{
			atendeu = atender();
			continuarTentando = !true;
			if(continuarTentando){
				tentativasRealizadas++;
			}else{
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}

		}while(continuarTentando && tentativasRealizadas < 3);

		if(atendeu){
			System.out.println("CONSEGUIMOS CONTATOS COM " + candidato + " NA " + tentativasRealizadas + "ª vez");
		}else{
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato);
		}
	}

	public static boolean atender(){
		return new Random().nextInt(3) == 1;
	}

	public static void imprimirSelecionados(){
		String []candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		for(int indice = 0; indice < candidatos.length; indice ++){
			System.out.println("O candidato de nº" + (indice + 1) + " é o " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação for each");

		for(String candidato: candidatos){
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	public static void selecaoCandidatos(){
		String []candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO",
		"MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido){
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	public static double valorPretendido(){
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	public static void analisarCandidato(double salarioPretendido){

		double salarioBase = 2000.0;//Atribuindo o valor 2000 a variável.

		if(salarioBase > salarioPretendido){//Verificando se o salario base é maior que o pretendido.
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido){//Verificando se o salario base é igual ao pretendido.
			System.out.println("lIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else{//Verificando se o salario é menor que o pretendido.
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
