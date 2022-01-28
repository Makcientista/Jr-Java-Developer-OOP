package Operações_Logicas;

public class Comando_Switch_Case {

	public static void main(String[] args) {
		int nota1 = 100;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 +nota4) / 4;
		
		/*Switch case: Serve para fazer operações exatas*/ //key: É a variavel que pretendemos verificar
		int dia =5;
		switch (dia ) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda - Feira");
			break;
		case 3:
			System.out.println("Terça - Feira");
			break;
		case 4:
			System.out.println("Quarta - Feira");
			break;
		case 5:
			System.out.println("Quinta - Feira");
			break;
		case 6:
			System.out.println("Sexta - Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default: 
			System.out.println("Outro dia qualquer " );
			break;
		}

	}

}
