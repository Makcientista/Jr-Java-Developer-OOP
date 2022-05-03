package POO_Executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import POO_Classes.Diretor;
import POO_Classes.Disciplina;
import POO_Classes.Student;
import POO_Classes.classesauxiliares.FuncaoaAutenticacao;
import POO_Classes.constantes.StudentStatus;
import curso.java.excecao.ExcecaoProcessarNota;

public class Studente_Exec {

	

	public static void main(String[] args) {
		
		/* Instancia ou cria��o de objecto */
		/* aluo1 � refer�ncia para o objeto Aluno */
		
		
		try {
			
	              lerArquivo();	
			
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		
										/*Vou travar o contato para autrizar somente quem realmente tem o controle 100% legitimo*/
		if (new FuncaoaAutenticacao(new Diretor(login, senha)).autenticar()) { /*se TRUE acessa se FALSE n�o acessa*/		
										
		List<Student> students = new ArrayList<Student>();
		/* � uma Lista que dentro dela trmos uma chavae que identifica uma sequ�ncia de valores tamb�m*/
	    HashMap<String, List<Student>> maps = new HashMap<String, List <Student>>();
	    

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* Entrada na console */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
			String idade = JOptionPane.showInputDialog("Qual � a idade do aluno? ");
			/*
			String dataNascimento = JOptionPane.showInputDialog("Qual � a data de nasciento do aluno? ");
			String rg = JOptionPane.showInputDialog("Qual � o registro geral do aluno? ");
			String cpf = JOptionPane.showInputDialog("Qual � o CPF do aluno? ");
			String mae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno? ");
			String pai = JOptionPane.showInputDialog("Qual � o nome do pai do aluno? ");
			String matricula = JOptionPane.showInputDialog("Qual � a data da matricula do aluno? ");
			String serie = JOptionPane.showInputDialog("Qual � a serie do aluno? ");
			String escola = JOptionPane.showInputDialog("Qual � a escola do aluno? "); */

			Student aluno1 = new Student(); /* Aqui ser� o jo�o */
			/* Passar os dados */
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade)); // converter String para int
		/*	
		    aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola); */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma diciplina");

			if (escolha == 0) { /* Op��o sim � zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); // valueOf
																												// retorna
																												// um
																												// inteiro
					posicao++; /* ++ soma + 1 */
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
				}
			}

			students.add(aluno1);
		}
		
		maps.put(StudentStatus.APROVADO, new ArrayList<Student>());
		maps.put(StudentStatus.REPROVADO, new ArrayList<Student>());
		maps.put(StudentStatus.RECUPERACAO, new ArrayList<Student>());

		
		for (Student student : students) { /*Separei os Students em Listas */
			
			if (student.getAlunoAprovado2().equalsIgnoreCase(StudentStatus.APROVADO)) {
				maps.get(StudentStatus.APROVADO).add(student);
			} 
			else if (student.getAlunoAprovado2().equalsIgnoreCase(StudentStatus.RECUPERACAO)) {
				maps.get(StudentStatus.REPROVADO).add(student);
			}
			else if (student.getAlunoAprovado2().equalsIgnoreCase(StudentStatus.REPROVADO)) {
				maps.get(StudentStatus.RECUPERACAO).add(student);
			}
		}
       
		System.out.println("********************Lista dos Aprovados****************************");
		for (Student student : maps.get(StudentStatus.APROVADO)) {
			System.out.println("Resultado = " + student.getAlunoAprovado2() + " com m�dia de = " + student.getMediaNota());
		}
		
		System.out.println("********************Lista dos Reprovados****************************");
		for (Student student : maps.get(StudentStatus.REPROVADO)) {
			System.out.println("Resultado = " + student.getAlunoAprovado2() + " com m�dia de = " + student.getMediaNota());
		}
		
		System.out.println("********************Lista dos Recupera��o****************************");
		for (Student student : maps.get(StudentStatus.RECUPERACAO)) {
			System.out.println("Resultado = " + student.getAlunoAprovado2() + " com m�dia de = " + student.getMediaNota());
		}
	  
	}
		else {
			JOptionPane.showConfirmDialog(null, "Acesso n�o permitido");
		}
		
		/*Aqui*/
		
		} catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			
			/*Mensagem do erro causa*/
			e.printStackTrace(); /*Imprimir erro no console Java*/
			//JOptionPane.showInternalMessageDialog(null, "Erro ao processar notas");
			
			/*Mensagem do Erro*/
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de error : " +e.getStackTrace()[pos].getClassName());
				saida.append("\n M�todo de  error : " +e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de error : " +e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class  : " +e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de convers�o de n�mero " + saida.toString());
			
			
		}	catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exception : " + e.getClass());
		}	catch (Exception e) { /* Captura todas as exce��es que n�o prevemos*/
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado : " + e.getClass().getName());
		}finally { /*Sempre � executado ocorrendo erros ou n�o*/
			/*Finally sempre � usado quando precisa executar um processo acntece erro ou n�o no sistema*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo" );
		}
		
	}
	
	public static void lerArquivo () throws ExcecaoProcessarNota {
		try {
		File fil = new File("c://arquivo.txt");
		Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}





