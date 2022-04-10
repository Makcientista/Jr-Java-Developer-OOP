package POO_Classes.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem contrato da interface de PermotirAcesso e chamar autenticar*/
public class FuncaoaAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	

	public boolean autenticar() {
		return permitirAcesso.autenticar();
		
	}
	
	public FuncaoaAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso=acesso;
	}
}
