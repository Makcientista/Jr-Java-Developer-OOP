package cursojava.thread;

import javax.swing.JOptionPane;

public class Aula01Thread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
	
		
		/*Thread processando em paralelo do envio de NOTA FISCAL  ELETRONICA*/
		Thread threadNFE = new Thread(thread2);
		threadNFE.toString();
		
		/*Codigo do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		/*Fluxo do siste,a, cadastro de venda, uma emissão de nota fiscal, algo do tipo*/
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*código da rotina que eu quero executar um paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
			
				/*Quero executar este envio com um tempo de parada, ou com um tempo determinado*/	
				System.out.println(" Executando alguma rotina, por exemplo envio de nota fiscal ");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /*dá um tempo*/
			}
			/*Fim do código em paralelo*/
		}
		
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*código da rotina que eu quero executar um paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
			
				/*Quero executar este envio com um tempo de parada, ou com um tempo determinado*/	
				System.out.println(" Executando alguma rotina, por exemplo envio de nota fiscal ");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /*dá um tempo*/
			}
			/*Fim do código em paralelo*/
		}
	};
}
