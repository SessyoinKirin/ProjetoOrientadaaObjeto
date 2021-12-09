import java.util.Scanner;
public class UsaData {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Data d1 = new Data();
		d1.setDia(473);
		System.out.println(d1);
		System.out.println("Dias de D1: "+d1.getDias());
		d1.setDia(2);
		System.out.println("D1: "+d1);
		System.out.println("Dias de D1: "+d1.getDias());
		
		
		Data d2 = new Data(12, 34, 2020);
		System.out.println("D2: "+d2);
		System.out.println("Maior D1 ou D2: "+d1.max(d2));
		System.out.println("Maior D1 ou 1/1/1900: "+d1.max(new Data(1,1,1900)));
		System.out.println("Intervalo de D1 e D2: "+d1.intervalo(d2));
		
		Data d3 = new Data();
		d3.setData(29,2,2021);
		System.out.println(d3);
		System.out.println("D3 eh valida? "+d3.isData()); 
		Data d4 = new Data(d3);
		//Data d4 = d3;
		System.out.println(d4);
		
		d3.setDia(12);
		d4.setMes(10);
		System.out.println(d3);
		System.out.println(d4);
	}
}

