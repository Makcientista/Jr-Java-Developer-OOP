package POO_Executavel;

import javax.swing.JOptionPane;

import POO_Classes.Declaração_tipos_publica_privada;
import POO_Classes.Student;

public class Studente_Exec {

	public static void main(String[] args) {
		/*Instancia ou criação de objecto*/
		/*aluo1 é referência para o objeto Aluno*/
		
		/*Entrada na console*/
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
		
		String disciplina1 = JOptionPane.showInputDialog("Qual a Disciplina 1");
		String nota1 = JOptionPane.showInputDialog("Qual é a nota1 do aluno? ");
		
		String disciplina2 = JOptionPane.showInputDialog("Qual a Disciplina 2");
		String nota2 = JOptionPane.showInputDialog("Qual é a nota2 do aluno? ");
		
		String disciplina3 = JOptionPane.showInputDialog("Qual a Disciplina 3");		
		String nota3 = JOptionPane.showInputDialog("Qual é a nota3 do aluno? ");
		
		String disciplina4 = JOptionPane.showInputDialog("Qual a Disciplina 4");
		String nota4 = JOptionPane.showInputDialog("Qual é a nota4 do aluno? ");
	
		
		
		Student aluno1 = new Student(); /*Aqui será o joão*/
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));	//resgatar o objeto e setar o atributo 
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));	
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));	
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));	
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);			
		aluno1.getDisciplina().setDisciplina2(disciplina2);	
		aluno1.getDisciplina().setDisciplina3(disciplina3);			
		aluno1.getDisciplina().setDisciplina4(disciplina4);	
		
		
		
		/*Imprmir dados na console*/
		System.out.println(aluno1);
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado do aluno = " + aluno1.getAlunoAprovado2());
		
		System.out.println("\n /***************+++++++++++****************/++++++++++++********/ \n");
		
		
		System.out.println("Nome é = " + aluno1.getNome());		
		System.out.println("idade  é = " + aluno1.getIdade());		
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());			
		System.out.println("Registro Geral  é = " + aluno1.getNumeroCpf());		
		System.out.println("Nome da mãe é = " + aluno1.getNomeMae());		
		System.out.println("Nome do pai  é = " + aluno1.getNomePai());		
		System.out.println("Data de matricula é = " + aluno1.getDataMatricula());
		System.out.println("Serie Matriculado é = " + aluno1.getSerieMatriculado());
		System.out.println("Nome da escola é = " + aluno1.getNomeEscola());
		System.out.println(" A média da nota é = " + aluno1.getMediaNota());
		
		
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
		
		
		/*Agora temos um objecto real na memoria*/
		Student aluno2 = new Student(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 		
		
		Student aluno3 = new Student();
		
		Student aluno4 = new Student("Maria"); //Contrutor 
		
		Student aluno5 = new Student("José", 50); //Contrutor
		
	}

}
