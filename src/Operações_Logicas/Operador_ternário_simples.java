package Operações_Logicas;

/*Operadores ternarios são para micro validações*/
public class Operador_ternário_simples {
	
	public static void main(String[] args) {
	   
		int nota1 = 70;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
       String saidaResultado;       
   	   
       saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperação": "Reprovado";
       
       System.out.println(saidaResultado);
		
	}

}
