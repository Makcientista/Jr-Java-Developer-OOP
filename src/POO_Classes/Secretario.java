package POO_Classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	 private String registro;
	 private String nivelCargo;
	 private String experirncia;
	 
	 private String login;
	 private String senha;
	 
	 public Secretario(String login,String senha) {
		 this.login = login; // this para endicar que é o login da class
		 this.senha = senha;
	
	 }
	 
	 public Secretario() {
		   
	   }
	 
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperirncia() {
		return experirncia;
	}
	public void setExperirncia(String experirncia) {
		this.experirncia = experirncia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experirncia=" + experirncia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.90;
	}
	
	
	
	@Override
	public boolean autenticar(String login, String senha) { 
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	 
	
	
	 
}
