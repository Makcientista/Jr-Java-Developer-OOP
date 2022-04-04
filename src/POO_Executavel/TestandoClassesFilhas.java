package POO_Executavel;

import POO_Classes.Diretor;
import POO_Classes.Pessoa;
import POO_Classes.Secretario;
import POO_Classes.Student;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setNome("Makiesse - Java Engeneer");
		student.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1234567");
		diretor.setNome("Kiassungua");		
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setExperirncia("Gest�o de Negocio");
		secretario.setNumeroCpf("258564987-80");
		secretario.setNome("Ant�nio");
		secretario.setIdade(18);
		
		System.out.println(student);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(student.pessoaMaiorIdade() + " - " + student.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno � = " + student.salario());	
		System.out.println("Salario do diretor � = " + diretor.salario());
		System.out.println("Salario do secretario � = " + secretario.salario());
		
		
           teste(student);
           teste(diretor);
           teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + " � o salario � de = " + pessoa.salario());
	}
	
	

}
