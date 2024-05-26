package Escola;

public class Escola {
	public static void main(String[] args) {
		//criou objetos
		Aluno felipe = new Aluno();

		//atribuiu valores
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino ");
		
		//imprimir os valores no console
		System.out.println("Aluno: " + felipe.getNome() + "\nIdade: " + felipe.getIdade() + "\nSexo: " + felipe.getSexo());
	}
}
