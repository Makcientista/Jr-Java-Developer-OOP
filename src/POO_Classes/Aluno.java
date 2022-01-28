package POO_Classes;

/*Classe/objecto que representa o Aluno*/
public class Aluno {

	/*Esses são os atributo do Aluno | que representam caracteristicas do mundo real*/
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	public Aluno() { /* Cria os dados na memoria - Sendo padrão do Java */

	}

	public Aluno(String nomePadrao) { // Inicializar costrutir com um valor fixo
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) { // Inicializar costrutir com  valores fixo
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
