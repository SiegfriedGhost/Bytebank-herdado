//Interfaces -> Classe abstrata, com todos m�todos abstratos 
//Interface -> Definir um contrato (Autenticavel) 
//Quem assina esse contrato, precisa implementar (n�o usa extends e sim implements)
	//m�todo setSenha 
	//m�todo autentica 

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	
}
