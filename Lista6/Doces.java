public class Doces extends Produto{
	
	public Doces() {
		super();
	}
	
	public Doces(double preco, double quantidade){
		super(preco, quantidade);
	}
	
	@Override
	public String toString(){
		return "Doces--[preco: "+getPreco()+", quantidade: "+getQuantidade()+", custo: "+Valor()+"]";
	}
}

