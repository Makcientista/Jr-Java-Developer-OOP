package POO_Executavel;

import POO_Classes.Aluno;

public class PrimeiraClasseJava {

	/*Main � um metodo auto executavel em Java*/
	public static void main(String[] args) {

		/*Instancia ou cria��o de objecto*/
		/*aluo1 � refer�ncia para o objeto Aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o jo�o*/
		
		/*Agora temos um objecto real na memoria*/
		Aluno aluno2 = new Aluno(); //Classe variavel_de_instancia(que faz referencia ao objecto do tipo da Classe) = new Objecto do tipo da Classe 
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria"); //Contrutor 
		
		Aluno aluno5 = new Aluno("Jos�", 50); //Contrutor
		
	}

}
