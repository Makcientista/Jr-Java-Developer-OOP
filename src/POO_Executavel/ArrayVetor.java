package POO_Executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import POO_Classes.Disciplina;
import POO_Classes.Student;

public class ArrayVetor {
	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasEngSW = { 8.9, 9.5, 7.4, 6.8 };

		/* Criação do Student */
		Student student = new Student();
		student.setNome("Makiesse Kiassungua");
		student.setNomeEscola("Java Developher");

		/* Criação da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Estrutura de Dados em Java");
		disciplina.setNota(notas);

		student.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Engenharia de Software");
		disciplina2.setNota(notasEngSW);

		student.getDisciplinas().add(disciplina2);

		System.out.println("Nome do aluno = " + student.getNome() + "inscrito no curso: " + student.getNomeEscola());
		System.out.println("--------------Disciplina do Aluno--------------");
		for (Disciplina d : student.getDisciplinas()) {

			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("A notas da disciplina são: ");

			double notaMax = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual " + d.getNota()[pos]);

				if (pos == 0) {
					notaMax = d.getNota()[pos];

				} else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];

					}
				}
			}
			System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " e de valor : " + notaMax);
		}

	}
}
