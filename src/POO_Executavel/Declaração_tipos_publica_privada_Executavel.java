package POO_Executavel;

import POO_Classes.Declaração_tipos_publica_privada;

public class Declaração_tipos_publica_privada_Executavel {

	public static void main(String[] args) {
		
				/*Instancia ou criação de objecto*/
				/*aluo1 é referência para o objeto Aluno*/
				Declaração_tipos_publica_privada aluno1 = new Declaração_tipos_publica_privada(); /*Aqui será o joão*/
				aluno1.nome = "João";
				aluno1.idade = 50;
				
				System.out.println("Nome do aluni 1 é: " + aluno1.nome);
				System.out.println("Idade é: " + aluno1.idade);
				
				
				/*Agora temos um objecto real na memoria*/
				Declaração_tipos_publica_privada aluno2 = new Declaração_tipos_publica_privada(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
				
				Declaração_tipos_publica_privada aluno3 = new Declaração_tipos_publica_privada();
				
				Declaração_tipos_publica_privada aluno4 = new Declaração_tipos_publica_privada("Maria"); //Contrutor 
				
				Declaração_tipos_publica_privada aluno5 = new Declaração_tipos_publica_privada("José", 50); //Contrutor
				
			}

		}



