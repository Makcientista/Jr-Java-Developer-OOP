package Opera��es_Logicas;

public class Opera��es_l�gicas_aninhadas {

	public static void main(String[] args) {
		int nota1 = 100;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 +nota4) / 4;
		if (media >= 50) {
			if(media >= 70) {
				if(media > 90) {
					System.out.println("Aluni esta aprovado direto - Parabens " + media);
				}
				else {
					System.out.println("Aluno esta em recupera��o " + media);
				}
			}
				else {
					System.out.println("Aluno esta em recupera��o " + media);
				}
		}
				else {
					System.out.println(" Aluno reprovado direto " + media);
				}
			}
			
		}

	


