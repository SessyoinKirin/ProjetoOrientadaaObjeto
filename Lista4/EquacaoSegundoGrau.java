import java.lang.Math;
public class EquacaoSegundoGrau {
	
	private int a;
	private int b;
	private int c;
	
	public EquacaoSegundoGrau(){
		
	}
	@Override
	public String toString(){
		return "a: "+a+"\nb: "+b+"\nc: "+c;
	}
	
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	public void setC(int c){
		this.c = c;
	}
	public double Delta(){
		return (b*b)-4*a*c;
	}
	public String Xis(){
		return "X1: "+(((-b) + Math.sqrt(Delta()))/2*a)+"\nX2: "+"X1: "+(((-b) - Math.sqrt(Delta()))/2*a);
		//System.out.println();
	}
	public String Xi(){
		return "X1: "+(((-b) + Math.sqrt(Delta()))/2*a);
		//System.out.println();
	}
	public String Xnada(){
		return "Nao ha resultado pois delta e negativo";
		//System.out.println();
	}
	public String TestDelta(){
		if(Delta() > 0){
			return Xis();
		}else if(Delta() == 0){
			return Xi();
		}else{
			return Xnada();
		}
	}
	
	
}

