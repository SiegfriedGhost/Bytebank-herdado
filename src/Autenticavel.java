//Interfaces -> Classe abstrata, com todos métodos abstratos 
//Interface -> Definir um contrato (Autenticavel) 
//Quem assina esse contrato, precisa implementar (não usa extends e sim implements)
	//método setSenha 
	//método autentica 

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	
}
