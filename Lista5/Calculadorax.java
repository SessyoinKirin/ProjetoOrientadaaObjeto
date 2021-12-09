public class Calculadorax{
	
	private int n1;
	private int n2;
	 
	
	public Calculadorax(){
		this.n1 = 1;
		this.n2 = 1;
	}
	
	public void setN1(int n1){
		this.n1 = n1;
	}
	
	public void setN2(int n2){
		this.n2 = n2;
	}
	
	public int getN1(){
		return n1;
	}
	
	public int getN2(){
		return n2;
	}
	
	public int somar(){
		return n1 + n2;
	}
	
	public int subtrair(){
		return n1 - n2;
	}
	
	public int multiplicar(){
		return n1 * n2;
	}
	
	public double dividir(){
		return (double)n1 / n2;
	}
}
