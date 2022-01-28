package Operações_Logicas;

public class Estrutura_repetição_WHILE_DO_WHILE {

	public static void main(String[] args) {
		int numero = 0;
		
		while(numero < 10) { /* verifica e executa o codigo*/
			System.out.println("O numero é: " + numero);
			numero ++;
		}
		
		System.out.println(" /* --------DO WHILE----------------*/ ");
		
		int numero2 = 0;
		do { /*primeiro executo, incrementa e depois verifica*/
			System.out.println("O numero é: " + numero2);
			numero2++;
			
		} while (numero2 <= 60);

	}

}
