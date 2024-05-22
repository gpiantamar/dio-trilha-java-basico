public class ExemploForArray {
	public static void main(String[] args) {
		String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

		/*O índice de elementos começam no valo[0]
		for(int x = 0; x < alunos.length; x++){//aluno.length -> tamanho do array
			System.out.println("O aluno (a)" + alunos[x] + " está no índice [" + x + "]" );
		} 
		*/
		//Forma abreviada
		for(String aluno: alunos){
			System.out.println("Nome do aluno é: " + aluno);
		}
	}
}
