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
		secretario.setExperirncia("Gestão de Negocio");
		secretario.setNumeroCpf("258564987-80");
		secretario.setNome("António");
		secretario.setIdade(18);
		
		System.out.println(student);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(student.pessoaMaiorIdade() + " - " + student.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno é = " + student.salario());	
		System.out.println("Salario do diretor é = " + diretor.salario());
		System.out.println("Salario do secretario é = " + secretario.salario());
		
		
           teste(student);
           teste(diretor);
           teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " é o salario é de = " + pessoa.salario());
	}
	
	

}
