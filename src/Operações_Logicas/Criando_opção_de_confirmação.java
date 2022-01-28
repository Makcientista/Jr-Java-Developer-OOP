package Operações_Logicas;

import javax.swing.JOptionPane;

public class Criando_opção_de_confirmação {

	public static void main(String[] args) {
		   
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, " Deseja ver o resultado da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao );
		}
		else {
			System.out.println(" Não quis ver o resultado"); 
		}
		
		resposta = JOptionPane.showConfirmDialog(null, " Deseja ver o RESTO da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto );
		}
		else {
			System.out.println(" Não quis ver o resultado"); 
		}
	}

}
