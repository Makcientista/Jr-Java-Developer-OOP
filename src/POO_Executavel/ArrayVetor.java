package POO_Executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o array deve ter?");

		// Array deve ter sempre quatidade de posi��es definidas
		double[] notas = new double[Integer.parseInt(posicoes)];/*Converster a posicoes de String para int*/
		
		
		for(int pos = 0; pos < notas.length; pos ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + pos);
			notas[pos] = Double.valueOf(valor); /*Convers�o da variavel valor de String para double */
			
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}

	}

}
