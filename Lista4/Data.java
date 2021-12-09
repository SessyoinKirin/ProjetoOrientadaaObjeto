public class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
	public Data(int dia, int mes, int ano){
		setData(1,1,1900);
		setData(dia, mes, ano);
	}
	public Data(Data data){
		setData(data.getDia(), data.getMes(), data.getAno());
	}
	public void setData(int dia, int mes, int ano){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public void setDia(int dia){
		if(dia >= 1 && dia<=31){
			this.dia = dia;
		}
	}
	public void setMes(int mes){
		if(mes >=1 && mes <=12){
			this.mes = mes;
		}
	}
	public void setAno(int ano){
		if(ano>=1900 && ano<=2100){
			this.ano = ano;	
		}
	}
	public Data getData(){
		return this;
	}
	
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	public boolean isData(){
		if(mes == 4 || mes == 6 || mes == 9|| mes == 11){
			return(dia <=30);
		}
		if(mes == 2){
			return (dia<=(29 - (ano%4)));
		}
		return true;
	}
	
	public int getDias(){
		return dia + mes *30 + ano*365;
	}

	public Data max(Data data){
		return (getDias() > data.getDias())?this : data;
	}
	public Data min(Data data){
		return (getDias() < data.getDias())?this: data;
	}
	public int intervalo(Data data){
		return Math.abs(getDias() - data.getDias());
	}
	
	@Override
	public String toString(){
		return dia+" | "+mes+" | "+" "+ano;
	}
	
}
