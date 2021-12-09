public class Date{
	private int dia;
	private int mes;
	private int ano;
	private int dias;
	
	public Date(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 2000;
		//this.dias=0;
	}
	/*public boolean isDate(){
		if()
	}*/
	public void setDias(){
		int mdias =0;
		for(int i = mes; i<=1; i--){
			if(i == 4|| i == 6|| i == 9|| i ==11){
				mdias+=i*30;
			}else if(i ==2){
				if(ano%4==0){
					mdias+=i*29;
				}else{
					mdias+=i*28;
				}
			}else{
				mdias+=i*31;
			}
		}
		dias = ano*((ano%4==0)?366:365)+mdias+dia;
	}
	public int getDias(){
		return dias;
	}
	public boolean verMes(){
		if(mes == 4|| mes == 6|| mes == 9|| mes ==11){
			return false;
		}else{
			return true;
		}
	}
	
	public void setDia(int dia){
		if(dia >= 1 && dia <= 31){
			if(mes == 4|| mes == 6|| mes == 9|| mes ==11){
				if(dia <=30 && dia >0){
					this.dia = dia;
				}
			}else if(mes == 2){
				if(ano%4 ==0){
					if(dia <= 29 && dia >0){
						this.dia = dia;
					}
				}else if(dia <= 28 && dia >0){
					this.dia = dia;
				}
			}else{
				this.dia = dia;
			}
		}
	}
	
	/*public void setDia(int dia){
		if(mes == 2){
			if(ano%4 ==0){
				if(dia <= 29 && dia >0){
					this.dia = dia;
				}
			}else if(dia <= 28 && dia >0){
				this.dia = dia;
			}
		}
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			if(dia <=31 && dia >0){
				this.dia = dia;
			}
		}
		if(mes == 4|| mes == 6|| mes == 9|| mes ==11){
			if(dia <=30 && dia >0){
				this.dia = dia;
			}
		}
	}*/
	public void setMes(int mes){
		if(mes <= 12){
			this.mes= mes;
		}
	}
	public void setAno(int ano){
		if(ano >= 2000 && ano <=2100){
			this.ano = ano;
		}
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
	
}
