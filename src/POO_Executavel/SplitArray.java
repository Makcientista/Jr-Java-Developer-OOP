package POO_Executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "mak, java code, 80, 70, 90, 89";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Nome: " + valoresArray[1]);
		System.out.println("Nome: " + valoresArray[2]);
		System.out.println("Nome: " + valoresArray[3]);
		System.out.println("Nome: " + valoresArray[4]);
		System.out.println("Nome: " + valoresArray[5]);
		
		System.out.println("---------*Convertendo uma array em uma lista*---------");
		/*Convertendo uma array em uma lista*/	
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) { //ler a lista
			System.out.println(valorString);
			
		}
		
		System.out.println("---------*Converter uma lista para uma array*---------");
		/*Converter uma lista para array*/
		String[] conversaoArray = list.toArray(new String[6]);
		
		for(int pos = 0; pos < conversaoArray.length; pos ++ ) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
