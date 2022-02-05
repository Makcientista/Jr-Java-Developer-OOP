package POO_Classes;

public class Equals_HashCode {

	/*
	 * Esses são os atributo do Aluno | que representam caracteristicas do mundo
	 * real
	 */
	/*
	 * private -> Para manter o controle da variavel e evita que o programador hamar
	 * uma variavel de forma errada e alterar o valor dela e causar erro no sistema
	 */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	public Equals_HashCode() { /* Cria os dados na memoria - Sendo padrão do Java */

	}

	public Equals_HashCode(String nomePadrao) { // Inicializar costrutir com um valor fixo
		nome = nomePadrao;
	}

	public Equals_HashCode(String nomePadrao, int idadePadrao) { // Inicializar costrutir com valores fixo
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*Veremos o metodo SETTERS e GETTERS do objecto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*Get para resgatar ou obter o valor do atributo*/
	
	
	/*Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome; /*this.nome para acessar o atributo(nome) da classe 
							"Metodos_comuns_Getters_etters" e = (recebendo o nome passado pelo parametro "String nome") */
	}	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	//Recuperar os dados setados
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	/*Metodos que retorna a media do Aluno*/
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	//Métodos com retorna true para Aprovado e false para Reprovado
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno está Aprovado";
			
		}else {
			return "Aluno está Reprovado";
		}
		
	}

	@Override
	public String toString() {
		return "Metodos_comuns_Getters_etters [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", nota4=" + nota4 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals_HashCode other = (Equals_HashCode) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
