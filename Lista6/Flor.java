public class Flor extends Plantas{
	
	private String cor;
	private int fQuantidade=0;
	
	public Flor(){
		super();
		setFquantidade();
	}
	
	public Flor(String nome, String especie, String cor) {
		super(nome, especie);
		setCor(cor);
		this.setFquantidade();
	}
	
	public void setFquantidade(){
		this.fQuantidade+=1;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return cor;
	}
	
	public int getFquantidade(){
		return fQuantidade;
	}
	
	@Override
	public String toString(){
		return "Flor--[nome: "+getNome()+", especie: "+getEspecie()+", cor: "+getCor()+"]";
	}
	
}

