package POO_Executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import POO_Classes.Disciplina;
import POO_Classes.Student;

public class Studente_Exec {

	public static void main(String[] args) {
		/* Instancia ou criação de objecto */
		/* aluo1 é referência para o objeto Aluno */

		List<Student> students = new ArrayList<Student>();

		for (int qtd = 0; qtd <= 1; qtd++) {

			/* Entrada na console */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
			String idade = JOptionPane.showInputDialog("Qual é a idade do aluno? ");
			String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nasciento do aluno? ");
			String rg = JOptionPane.showInputDialog("Qual é o registro geral do aluno? ");
			String cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno? ");
			String mae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno? ");
			String pai = JOptionPane.showInputDialog("Qual é o nome do pai do aluno? ");
			String matricula = JOptionPane.showInputDialog("Qual é a data da matricula do aluno? ");
			String serie = JOptionPane.showInputDialog("Qual é a serie do aluno? ");
			String escola = JOptionPane.showInputDialog("Qual é a escola do aluno? ");

			Student aluno1 = new Student(); /* Aqui será o joão */
			/* Passar os dados */
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade)); // converter String para int
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma diciplina");

			if (escolha == 0) { /* Opção sim é zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); // valueOf
																												// retorna
																												// um
																												// inteiro
					posicao++; /* ++ soma + 1 */
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
				}
			}

			students.add(aluno1);
		}

		for (Student student : students) {

			if (student.getNome().equalsIgnoreCase("mak")) {
				students.remove(student);
				break;
			} else {
				/* Imprmir dados na console */
				System.out.println(student); /* Descrição do objeto na memoria */
				System.out.println("Média do aluno = " + student.getMediaNota());
				System.out.println("Resultado do aluno = " + student.getAlunoAprovado2());
				System.out.println("\n /***************+++++++++++****************/++++++++++++********/ \n");

			}
		}
		for (Student student : students) {
			System.out.println("Aluno que sobraram na lista");
			System.out.println(student.getNome());
			System.out.println("Suas materias são");
			for(Disciplina disciplina : student.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}

	}

}
