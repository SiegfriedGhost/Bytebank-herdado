
public class ControleBonificacao {

	private double soma; 
	
	//Polimorfismo 
	public void registra(Funcionario f) {
		// TODO Auto-generated method stub
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		
		return soma; 
		
	}
}
