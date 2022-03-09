package Loja_POO;

import java.math.BigDecimal;

public class ExecutarLojaPOO {

	public static void main(String[] args) {
		
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome(" Estrutura de Dados");
		produto1.setValor(BigDecimal.valueOf(100));
		
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Moódulo de Micro Seriços");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome(" Engenharia de Software");
		produto3.setValor(BigDecimal.valueOf(100));

		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome(" RPA com Java");
		produto4.setValor(BigDecimal.valueOf(300));
		
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Engenheiro Java");
		venda.setEnderecoEntrega("Rua Ochimini 280");
		venda.setId(10L);
		venda.setNomeCliente("Makiesse Kiassungua");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /*Não consigo fazer validação*/
		venda.addProduto(produto3);/*Posso fazer validações antes de adicionar na lista*/	
		venda.addProduto(produto4);
		
		
		/*System.out.println("Descrição Venda: " + venda.getDescricaoVenda()); */
				
		
		System.out.println("Valor da variável total venda: " + venda.getValorTotal());
	}

}
