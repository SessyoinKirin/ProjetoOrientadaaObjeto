public class Arvore extends Plantas{
	
	private boolean frutifera;
	
	
	public Arvore(){
		super();
		
	}
	
	public Arvore(String nome, String especie, boolean frutifera){
		super(nome, especie);
		setFrutifera(frutifera);
		
	}
	
	public void setFrutifera(boolean frutifera){
		this.frutifera = frutifera;
	}
	
	public boolean isFrutifera(){
		return frutifera;
	}
	
	@Override
	public String toString(){
		return "Arvore--[nome: "+getNome()+", especie: "+getEspecie()+", frutifera: "+(isFrutifera()?"sim":"nao")+"]";
	}
}

/*
	public void setArCondicionado(boolean arCondicionado){
		this.arCondicionado = arCondicionado;
	}
	public void setPortas(int portas){
		this.portas = portas;
	}
	public boolean hasArCondicionado(){
		return arCondicionado;
	}
	public int getPortas(){
		return portas;
	}
}

*/
