package POO_Executavel;

import POO_Classes.Declara��o_tipos_publica_privada;
import POO_Classes.Metodos_comuns_Getters_etters;

public class Metodos_comuns_Getters_etters_Executavel {

	public static void main(String[] args) {
		/*Instancia ou cria��o de objecto*/
		/*aluo1 � refer�ncia para o objeto Aluno*/
		Metodos_comuns_Getters_etters aluno1 = new Metodos_comuns_Getters_etters(); /*Aqui ser� o jo�o*/
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("25/09/1993");
		aluno1.setRegistroGeral("333.444.555");
		aluno1.setNumeroCpf("222.235.458.20");
		aluno1.setNomeMae(" Paula Duarte");
		aluno1.setNomePai("Moises Chimuco");
		aluno1.setDataMatricula("27/01/2022");
		aluno1.setNomeEscola("Toronto University");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
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
