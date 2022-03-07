package principio.responsabilidade;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;

	public void soma100Reais() {
		saldo += 100; /*� mesmo que saldo = saldo + 100*/
	}
	
	public void diminui100Reais() {
		saldo -= 100; /*� mesmo que saldo = saldo - 100*/
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque; /*� mesmo que saldo = saldo - saque*/
	}
	
	public void depositarDinheiro(double deposito) {
		saldo += deposito; /*� mesmo que saldo = saldo + deposito*/
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
}
