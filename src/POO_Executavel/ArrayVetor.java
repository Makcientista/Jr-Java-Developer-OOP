package POO_Executavel;

public class ArrayVetor {
	public static void main(String[] args) {
		
		//Arra deve ter sempre quatidade de posi��es definidas
		double[] notas = new double [5];
		
		//Atribuir valor na sposi��es do array
		notas[0] = 9.8;
		notas[1] = 8.9 ;
		notas[2] = 7.10;
		notas[3] = 10.5;
		
		for(int pos = 0; pos < notas.length; pos++ ) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}
		
		
		
	}
	
	
	

}
