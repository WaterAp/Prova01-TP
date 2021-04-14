package br.edu.univas;

public class Questao1 {

	public static void main(String[] args) {
		
		int nota1, nota2, nota3, nota4;
		double media;
		
		nota1 = 91;
		nota2 = 83;
		nota3 = 77;
		nota4 = 80;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			
			System.out.println("Aluno Aprovado");
		} else if (media < 70 && media >= 50) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno em dependência");
		}
		
		
		
		
		
		
	}
}







