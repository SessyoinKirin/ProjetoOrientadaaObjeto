public class Numero {
	
	private int n;
	
	public Numero(){
		this.n = 12;
	}
	
	public void setN(int n){
		if(n >= 0){
			this.n=n;
		}
	}
	
	public int getN(){
		return n;
	}
	
	public int inverter(){
		String nStr = ""+n;
		String inverso = "";
		for(int i=0; i<nStr.length(); i++){
			inverso = nStr.charAt(i)+inverso;
		}
		return Integer.parseInt(inverso);
	}
	
	public boolean ehPrimo(){
		int contador =0;
		for(int i=1; i<=n; i++){
			if(n%i == 0){
				contador++;
			}
		}
		/*if(contador == 2){
			return true;
		}else{
			return false;
		}*/
		return(contador == 2);
	}
	
}

