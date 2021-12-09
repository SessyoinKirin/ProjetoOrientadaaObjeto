public class Paozinho extends Produto{
	
	public Paozinho() {
		super();
	}
	
	public Paozinho(double preco, double quantidade){
		super(preco, quantidade);
	}
	
	@Override
	public String toString(){
		return "Paozinho--[preco: "+getPreco()+", quantidade: "+getQuantidade()+", custo: "+Valor()+"]";
	}
}

