import java.util.Scanner;
public class UsaDate {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Date date = new Date();
		int opcao =0;
		
		//do{}while();
		date.setDia(2);
		date.setMes(4);
		date.setAno(2002);
		System.out.println("Dia: "+date.getDia());
		System.out.println("Mes: "+date.getMes());
		System.out.println("Ano: "+date.getAno());
		System.out.println("Dias: "+date.getDias());
		
	}
}

