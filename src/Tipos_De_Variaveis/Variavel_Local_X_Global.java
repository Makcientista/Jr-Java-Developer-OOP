package Tipos_De_Variaveis;

public class Variavel_Local_X_Global {

	/* Variavel Global � acessivel a todos e o seu valor � compartilhado */
	static int maiorIdadeGlobal = 30;

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Variavel local porque pertence somente a esse m�todo e o valor fica dentro deste metodo */
		int maiorIdade = 18;
		System.out.println(" Valor variavel local = " + maiorIdade);
		System.out.println(" Valor variavel Global = " + maiorIdadeGlobal); 
		
		metodo2();

	}

	public static void metodo2() {
		 System.out.println(" Valor da variavel Global = " + maiorIdadeGlobal); 
	}
	
}
