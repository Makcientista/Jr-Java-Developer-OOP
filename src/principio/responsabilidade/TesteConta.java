package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Makiesse Kiassungua");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		
		bancaria.sacarDinheiro(400);
		System.out.println(bancaria);
		
		bancaria.depositarDinheiro(1000);
		System.out.println(bancaria);
		
		
		
	}

}
