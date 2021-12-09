public class ConversaoDeUnidadeDeArea {
	
	private double metro;
	private double pe;
	private double milha;
	private double acre;
	
	public ConversaoDeUnidadeDeArea() {
		metro = 1.0;
		pe = 1.0;
		milha =1.0;
		acre = 1.0;
	}
	
	public void setMetro(double metro){
		this.metro = metro;
	}
	public void setPe(double pe){
		this.pe = pe;
	}
	public void setMilha(double milha){
		this.milha = milha;
	}
	public void setAcre(double acre){
		this.acre = acre;
	}
	public double getMetro(){
		return metro;
	}
	public double getPe(){
		return pe;
	}
	public double getMilha(){
		return milha;
	}
	public double getAcre(){
		return acre;
	}
	public double metroToPe(){
		return getMetro()*10.76;
	}
	public double metroToMilha(){
		return (getMetro()*10.76)/(640*43560);
	}
	public double metroToAcre(){
		return (getMetro()*10.76)/43560;
	}
	public double peToMetro(){
		return getPe()/10.76;
	}
	public double peToMilha(){
		return getPe()/(640*43560);
	}
	public double peToAcre(){
		return getPe()/43560;
	}
	public double milhaToMetro(){
		return (getMilha()*640*43560)/10.76;
	}
	public double milhaToPe(){
		return getMilha()*640*43560;
	}
	public double milhaToAcre(){
		return getMilha()*640;
	}
	public double acreToMetro(){
		return (getAcre()*43560)/10.76;
	}
	public double acreToPe(){
		return getAcre()*43560;
	}
	public double acreToMilha(){
		return getAcre()/640;
	}
}

