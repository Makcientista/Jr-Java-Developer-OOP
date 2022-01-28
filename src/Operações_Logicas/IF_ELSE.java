package Operações_Logicas;

public class IF_ELSE {

	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Marina";

		if (mediaAluno >= 70 && nome.equals("Maria")) {
			System.out.println("Parabens você está aprovado");
		}
		else if (mediaAluno < 70) {
			System.out.println("Você esta reprovado");
		}
		else {
			System.out.println("Aluno não encontrado");
		}

	}
}