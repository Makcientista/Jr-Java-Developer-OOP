package POO_Executavel;

import POO_Classes.Declaração_tipos_publica_privada;
import POO_Classes.Metodos_comuns_Getters_etters;

public class Metodos_comuns_Getters_etters_Executavel {

	public static void main(String[] args) {
		/*Instancia ou criação de objecto*/
		/*aluo1 é referência para o objeto Aluno*/
		Metodos_comuns_Getters_etters aluno1 = new Metodos_comuns_Getters_etters(); /*Aqui será o joão*/
		aluno1.setNome("João da Silva");
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
