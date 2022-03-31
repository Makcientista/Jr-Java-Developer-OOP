package POO_Executavel;

import POO_Classes.Diretor;
import POO_Classes.Secretario;
import POO_Classes.Student;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setNome("Makiesse - Java Engeneer");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1234567");
		
		
		Secretario secretario = new Secretario();
		secretario.setExperirncia("Gestão de Negocio");
		secretario.setNumeroCpf("258564987-80");
		
		System.out.println(student);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
