public class Plantas {
	
	private String nome;
	private String especie;
	private int quantidade = 0;
	
	public Plantas(){
		//setQuantidade();
	}
	public Plantas(String nome, String especie) {
		setNome(nome);
		setEspecie(especie);
		//this.setQuantidade();
	}
	
	public void setQuantidade(){
		this.quantidade+=1;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEspecie(String especie){
		this.especie = especie;
	}
	public String getNome(){
		return nome;
	}
	public String getEspecie(){
		return especie;
	}
	public int getQuantidade(){
		return quantidade;
	}
}

