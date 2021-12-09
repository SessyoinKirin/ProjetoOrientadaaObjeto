public class Produto {
	
	private double preco;
	private double quantidade;
	
	public Produto() {
		
	}
	public Produto(double preco, double quantidade){
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	public void setQuantidade(double quantidade){
		this.quantidade = quantidade;
	}
	public double getPreco(){
		return preco;
	}
	public double getQuantidade(){
		return quantidade;
	}
	public double Valor(){
		return preco*quantidade;
	}
}

