package POO_Executavel;

import POO_Classes.Declara��o_tipos_publica_privada;

public class Declara��o_tipos_publica_privada_Executavel {

	public static void main(String[] args) {
		
				/*Instancia ou cria��o de objecto*/
				/*aluo1 � refer�ncia para o objeto Aluno*/
				Declara��o_tipos_publica_privada aluno1 = new Declara��o_tipos_publica_privada(); /*Aqui ser� o jo�o*/
				aluno1.nome = "Jo�o";
				aluno1.idade = 50;
				
				System.out.println("Nome do aluni 1 �: " + aluno1.nome);
				System.out.println("Idade �: " + aluno1.idade);
				
				
				/*Agora temos um objecto real na memoria*/
				Declara��o_tipos_publica_privada aluno2 = new Declara��o_tipos_publica_privada(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
				
				Declara��o_tipos_publica_privada aluno3 = new Declara��o_tipos_publica_privada();
				
				Declara��o_tipos_publica_privada aluno4 = new Declara��o_tipos_publica_privada("Maria"); //Contrutor 
				
				Declara��o_tipos_publica_privada aluno5 = new Declara��o_tipos_publica_privada("Jos�", 50); //Contrutor
				
			}

		}



