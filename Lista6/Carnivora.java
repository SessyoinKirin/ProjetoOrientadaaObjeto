public class Carnivora extends Plantas{
	
	private boolean venenosa;
	private int cQuantidade=0;
	
	public Carnivora(){
		super();
		setCquantidade();
	}
	
	public Carnivora(String nome, String especie, boolean venenosa){
		super(nome, especie);
		setVenenosa(venenosa);
		this.setCquantidade();
	}
	
	public void setCquantidade(){
		this.cQuantidade+=1;
	}
	
	public void setVenenosa(boolean venenosa){
		this.venenosa = venenosa;
	}
	
	public boolean isVenenosa(){
		return venenosa;
	}
	public int getCquantidade(){
		return cQuantidade;
	}
	@Override
	public String toString(){
		return "Carnivora--[nome: "+getNome()+", especie: "+getEspecie()+", venenosa: "+(isVenenosa()?"sim":"nao")+"]";
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
