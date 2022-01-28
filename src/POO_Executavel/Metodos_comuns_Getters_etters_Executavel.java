package POO_Executavel;

import javax.swing.JOptionPane;

import POO_Classes.Declaração_tipos_publica_privada;
import POO_Classes.Metodos_comuns_Getters_etters;

public class Metodos_comuns_Getters_etters_Executavel {

	public static void main(String[] args) {
		/*Instancia ou criação de objecto*/
		/*aluo1 é referência para o objeto Aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual é a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nasciento do aluno? ");
		String rg = JOptionPane.showInputDialog("Qual é o registro geral do aluno? ");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno? ");
		String mae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno? ");
		String pai = JOptionPane.showInputDialog("Qual é o nome da pai do aluno? ");
		String matricula = JOptionPane.showInputDialog("Qual é a data da matricula do aluno? ");
		String serie = JOptionPane.showInputDialog("Qual é a serie do aluno? ");
		String escola = JOptionPane.showInputDialog("Qual é a escola do aluno? ");
		String setNota1 = JOptionPane.showInputDialog("Qual é a nota1 do aluno? ");
		String setNota2 = JOptionPane.showInputDialog("Qual é a nota2 do aluno? ");
		String setNota3 = JOptionPane.showInputDialog("Qual é a nota3 do aluno? ");
		String setNota4 = JOptionPane.showInputDialog("Qual é a nota4 do aluno? ");
		
		
		Metodos_comuns_Getters_etters aluno1 = new Metodos_comuns_Getters_etters(); /*Aqui será o joão*/
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
		Metodos_comuns_Getters_etters aluno2 = new Metodos_comuns_Getters_etters(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
		
		Metodos_comuns_Getters_etters aluno3 = new Metodos_comuns_Getters_etters();
		
		Metodos_comuns_Getters_etters aluno4 = new Metodos_comuns_Getters_etters("Maria"); //Contrutor 
		
		Metodos_comuns_Getters_etters aluno5 = new Metodos_comuns_Getters_etters("José", 50); //Contrutor
		
	}

}
