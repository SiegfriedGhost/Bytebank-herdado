//abstract -> apenas um conceito, n�o � concreto 
public abstract class Funcionario {

	private String nome;
	
	private String cpf;
	
	private double salario;

//	M�todo Padr�o
//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}
	
	//M�todo abstrato (n�o padr�o), deve ser implementado nas classes filhas 
	//Um m�todo abstrato define apenas a assinatura (visibilidade, retorno, 
	//nome do m�todo e par�metros)
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
		
	
}
