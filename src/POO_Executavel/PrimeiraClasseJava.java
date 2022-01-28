package POO_Executavel;

import POO_Classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {

		/*Instancia ou criação de objecto*/
		/*aluo1 é referência para o objeto Aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o joão*/
		
		/*Agora temos um objecto real na memoria*/
		Aluno aluno2 = new Aluno(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria"); //Contrutor 
		
		Aluno aluno5 = new Aluno("José", 50); //Contrutor
		
	}

}
