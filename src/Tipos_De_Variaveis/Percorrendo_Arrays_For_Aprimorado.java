package Tipos_De_Variaveis;

public class Percorrendo_Arrays_For_Aprimorado {
    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i; // total = total + i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
        
        
        System.out.println("---------------ARRAY FOR APRIMORADO---------------");
        
        String[] jogadores = { "Rivaldo", "Taffarel", "Cafu" };
    	for (String v : jogadores) {
    		System.out.println(v);
    	}

    	double[] numbers = { 10, 1, 2 };
    	double totalhoje = 0;
    	for (Double d : numbers) {
    		totalhoje += d;
    	}
    	System.out.println("Total: " + totalhoje);

    }
    
    
    

}