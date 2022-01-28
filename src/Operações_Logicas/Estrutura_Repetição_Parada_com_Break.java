package Operações_Logicas;

public class Estrutura_Repetição_Parada_com_Break {

	public static void main(String[] args) {
		
		/*Estrutura de repetição e parada com Break(para/stop)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 5) {
				System.out.println("Obaa, encontrei o numero 5");
				System.out.println(" estou parando de executar...");
				break;
			}
			
		}
	}

}
