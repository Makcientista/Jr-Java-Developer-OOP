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
				
		
		
		/* Criação do Student */
		Student student2 = new Student();
		student2.setNome("Makiesse Kiassungua 2");
		student2.setNomeEscola("Java Developher");

		/* Criação da disciplina */
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Estrutura de Dados em Java ");
		disciplina3.setNota(notas);

		student2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Engenharia de Software ");
		disciplina4.setNota(notasEngSW);

		student2.getDisciplinas().add(disciplina4);
		

		//-----------------------------------------------
		
		Student[] arrayStudent = new Student[2];
		
		arrayStudent[0] = student;
		arrayStudent[1] = student2;
		
		for(int pos = 0; pos < arrayStudent.length; pos ++) {
			System.out.println("Nome do aluno é: " + arrayStudent[pos].getNome());
			
			for (Disciplina d : arrayStudent[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número:  " + posnota +  " é igual = " + d.getNota()[posnota]);
					
				}
			}
		}

	}
}
