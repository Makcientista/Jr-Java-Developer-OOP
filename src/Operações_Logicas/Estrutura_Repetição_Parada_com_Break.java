package Opera��es_Logicas;

public class Estrutura_Repeti��o_Parada_com_Break {

	public static void main(String[] args) {
		
		/*Estrutura de repeti��o e parada com Break(para/stop)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if(numero == 5) {
				System.out.println("Obaa, encontrei o numero 5");
				System.out.println(" estou parando de executar...");
				break;
			}
			
		}
	}

}
