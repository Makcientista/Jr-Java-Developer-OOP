package Opera��es_Logicas;

/*Operadores ternarios s�o para micro valida��es*/
public class Operador_tern�rio_simples {
	
	public static void main(String[] args) {
	   
		int nota1 = 70;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
       String saidaResultado;       
   	   
       saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recupera��o": "Reprovado";
       
       System.out.println(saidaResultado);
		
	}

}
