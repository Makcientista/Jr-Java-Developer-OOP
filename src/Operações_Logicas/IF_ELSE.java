package Opera��es_Logicas;

public class IF_ELSE {

	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Marina";

		if (mediaAluno >= 70 && nome.equals("Maria")) {
			System.out.println("Parabens voc� est� aprovado");
		}
		else if (mediaAluno < 70) {
			System.out.println("Voc� esta reprovado");
		}
		else {
			System.out.println("Aluno n�o encontrado");
		}

	}
}