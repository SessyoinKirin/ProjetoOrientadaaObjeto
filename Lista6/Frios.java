public class Frios extends Produto{
	
	public Frios() {
		super();
	}
	
	public Frios(double preco, double quantidade){
		super(preco, quantidade);
	}
	
	@Override
	public String toString(){
		return "Frio--[preco: "+getPreco()+", quantidade: "+getQuantidade()+", custo: "+Valor()+"]";
	}
}

