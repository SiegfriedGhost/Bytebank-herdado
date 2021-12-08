//abstract -> apenas um conceito, não é concreto 
public abstract class Funcionario {

	private String nome;
	
	private String cpf;
	
	private double salario;

//	Método Padrão
//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}
	
	//Método abstrato (não padrão), deve ser implementado nas classes filhas 
	//Um método abstrato define apenas a assinatura (visibilidade, retorno, 
	//nome do método e parâmetros)
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
