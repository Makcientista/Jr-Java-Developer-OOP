package POO_Executavel;

import POO_Classes.Equals_HashCode;

public class Equals_HashCode_Exec {

	public static void main(String[] args) {

		Equals_HashCode aluno1 = new Equals_HashCode();
		aluno1.setNome("Mak");

		Equals_HashCode aluno2 = new Equals_HashCode();
		aluno2.setNome("Mak");

		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		} else {
			System.out.println("Alunos n�o s�o iguais");
		}

	}

}
