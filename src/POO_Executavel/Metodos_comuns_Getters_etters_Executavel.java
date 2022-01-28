package POO_Executavel;

import javax.swing.JOptionPane;

import POO_Classes.Declara��o_tipos_publica_privada;
import POO_Classes.Metodos_comuns_Getters_etters;

public class Metodos_comuns_Getters_etters_Executavel {

	public static void main(String[] args) {
		/*Instancia ou cria��o de objecto*/
		/*aluo1 � refer�ncia para o objeto Aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual � a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual � a data de nasciento do aluno? ");
		String rg = JOptionPane.showInputDialog("Qual � o registro geral do aluno? ");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF do aluno? ");
		String mae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno? ");
		String pai = JOptionPane.showInputDialog("Qual � o nome da pai do aluno? ");
		String matricula = JOptionPane.showInputDialog("Qual � a data da matricula do aluno? ");
		String serie = JOptionPane.showInputDialog("Qual � a serie do aluno? ");
		String escola = JOptionPane.showInputDialog("Qual � a escola do aluno? ");
		String setNota1 = JOptionPane.showInputDialog("Qual � a nota1 do aluno? ");
		String setNota2 = JOptionPane.showInputDialog("Qual � a nota2 do aluno? ");
		String setNota3 = JOptionPane.showInputDialog("Qual � a nota3 do aluno? ");
		String setNota4 = JOptionPane.showInputDialog("Qual � a nota4 do aluno? ");
		
		
		Metodos_comuns_Getters_etters aluno1 = new Metodos_comuns_Getters_etters(); /*Aqui ser� o jo�o*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); //converter String para int
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Integer.valueOf(setNota1));
		aluno1.setNota1(Integer.valueOf(setNota2));
		aluno1.setNota1(Integer.valueOf(setNota3));
		aluno1.setNota1(Integer.valueOf(setNota4));
		
		
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
		
		
		
		/*Agora temos um objecto real na memoria*/
		Metodos_comuns_Getters_etters aluno2 = new Metodos_comuns_Getters_etters(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
		
		Metodos_comuns_Getters_etters aluno3 = new Metodos_comuns_Getters_etters();
		
		Metodos_comuns_Getters_etters aluno4 = new Metodos_comuns_Getters_etters("Maria"); //Contrutor 
		
		Metodos_comuns_Getters_etters aluno5 = new Metodos_comuns_Getters_etters("Jos�", 50); //Contrutor
		
	}

}
