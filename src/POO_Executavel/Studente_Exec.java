package POO_Executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import POO_Classes.Disciplina;
import POO_Classes.Student;

public class Studente_Exec {

	public static void main(String[] args) {
		/* Instancia ou cria��o de objecto */
		/* aluo1 � refer�ncia para o objeto Aluno */

		List<Student> students = new ArrayList<Student>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* Entrada na console */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
			String idade = JOptionPane.showInputDialog("Qual � a idade do aluno? ");
			String dataNascimento = JOptionPane.showInputDialog("Qual � a data de nasciento do aluno? ");
			String rg = JOptionPane.showInputDialog("Qual � o registro geral do aluno? ");
			String cpf = JOptionPane.showInputDialog("Qual � o CPF do aluno? ");
			String mae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno? ");
			String pai = JOptionPane.showInputDialog("Qual � o nome do pai do aluno? ");
			String matricula = JOptionPane.showInputDialog("Qual � a data da matricula do aluno? ");
			String serie = JOptionPane.showInputDialog("Qual � a serie do aluno? ");
			String escola = JOptionPane.showInputDialog("Qual � a escola do aluno? ");

			Student aluno1 = new Student(); /* Aqui ser� o jo�o */
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

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma diciplina");

			if (escolha == 0) { /* Op��o sim � zero */

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

		for (int pos = 0; pos < students.size(); pos++) { // per correr aluno

			Student student = students.get(pos);

			if (student.getNome().equalsIgnoreCase("Makiesse")) {
				Student trocar = new Student();
				trocar.setNome("Aluno foi trocado");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matem�tica");
				disciplina.setNota(96);

				trocar.getDisciplinas().add(disciplina);
				
				students.set(pos, trocar);
				student = students.get(pos); //resgatar o aluno

			}

			System.out.println("Aluno = " + student.getNome());
			System.out.println("Madia do aluno = " + student.getMediaNota());
			System.out.println("Resultado = " + student.getAlunoAprovado2());
			System.out.println("---------------------------------------------------");

			for (int posd = 0; posd < student.getDisciplinas().size(); posd++) { // per correr a as posi��es das
																					// disciplina deste aluno
				Disciplina disc = student.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota =" + disc.getNota());
			}
		}
	}

}
