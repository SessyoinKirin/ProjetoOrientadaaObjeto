public class Waiter {
	
	private int preco;
	private int people;
	
	public Waiter(){
		
	}
	
	public void setPreco(int preco){
		this.preco = preco;
	}
	public void setPeople(int people){
		this.people = people;
	}
	public double GiveMoneyToWaiter(){
		return (preco*1.1)/people;
	}
	public double NoGiveMoneyToWaiter(){
		return preco*1.0/people;
	}
}

