//Gerente é um Funcionario, gerente herda a class Funcionario, assina o contrato Autenticavel 
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador; 
	
	//Composição
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}	
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente!");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
	}

}
