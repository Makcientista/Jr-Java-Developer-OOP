package POO_Executavel;

import javax.swing.JOptionPane;
import POO_Classes.Disciplina;
import POO_Classes.Student;

public class Studente_Exec {

	public static void main(String[] args) {
		/*Instancia ou cria��o de objecto*/
		/*aluo1 � refer�ncia para o objeto Aluno*/
		
		/*Entrada na console*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual � a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual � a data de nasciento do aluno? ");
		String rg = JOptionPane.showInputDialog("Qual � o registro geral do aluno? ");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF do aluno? ");
		String mae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno? ");
		String pai = JOptionPane.showInputDialog("Qual � o nome do pai do aluno? ");
		String matricula = JOptionPane.showInputDialog("Qual � a data da matricula do aluno? ");
		String serie = JOptionPane.showInputDialog("Qual � a serie do aluno? ");
		String escola = JOptionPane.showInputDialog("Qual � a escola do aluno? ");
		
				
		Student aluno1 = new Student(); /*Aqui ser� o jo�o*/
		/*Passar os dados*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); //converter String para int
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		Disciplina subject1 = new Disciplina();
		subject1.setDisciplina("Banco de Dados");
		subject1.setNota(90);
		

		
		Disciplina subject2 = new Disciplina();
		subject2.setDisciplina("Matematica");
		subject2.setNota(80);
		
		

		Disciplina subject3 = new Disciplina();
		subject3.setDisciplina("Geografia");
		subject3.setNota(80);
		
		
		Disciplina subject4 = new Disciplina();
		subject4.setDisciplina("Java Web");
		subject4.setNota(80);
		
		
		aluno1.getDisciplinas().add(subject1); //add subject1
		aluno1.getDisciplinas().add(subject2); //add subject2
		aluno1.getDisciplinas().add(subject3); //add subject3
		aluno1.getDisciplinas().add(subject4); //add subject4	
		
		
		/*Imprmir dados na console*/
		System.out.println(aluno1);
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado do aluno = " + aluno1.getAlunoAprovado2());
		
		System.out.println("\n /***************+++++++++++****************/++++++++++++********/ \n");
		
		
		System.out.println("Nome � = " + aluno1.getNome());		
		System.out.println("idade  � = " + aluno1.getIdade());		
		System.out.println("Nascimento � = " + aluno1.getDataNascimento());			
		System.out.println("Registro Geral  � = " + aluno1.getNumeroCpf());		
		System.out.println("Nome da m�e � = " + aluno1.getNomeMae());		
		System.out.println("Nome do pai  � = " + aluno1.getNomePai());		
		System.out.println("Data de matricula � = " + aluno1.getDataMatricula());
		System.out.println("Serie Matriculado � = " + aluno1.getSerieMatriculado());
		System.out.println("Nome da escola � = " + aluno1.getNomeEscola());
		System.out.println(" A m�dia da nota � = " + aluno1.getMediaNota());
		
		
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
	}

}
