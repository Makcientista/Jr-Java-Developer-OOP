package POO_Classes;

/*Classe/objecto que representa o Aluno*/
public class Declara��o_tipos_publica_privada {

		/*Esses s�o os atributo do Aluno | que representam caracteristicas do mundo real*/
		public String nome;
		public int idade;
		public String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;
		


		public Declara��o_tipos_publica_privada() { /* Cria os dados na memoria - Sendo padr�o do Java */

		}

		public Declara��o_tipos_publica_privada(String nomePadrao) { // Inicializar costrutir com um valor fixo
			nome = nomePadrao;
		}
		
		public Declara��o_tipos_publica_privada (String nomePadrao, int idadePadrao) { // Inicializar costrutir com  valores fixo
			nome = nomePadrao;
			idade = idadePadrao;
		}
		
		
	
	}


