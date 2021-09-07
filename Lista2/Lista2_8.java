import java.util.Scanner;
public class Lista2_8 {
	
	static int dado(){
		int n1;
		n1 = (int)((Math.random()*6)+1);
		return n1;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador1=0, contador2=0, contador3=0, contador4=0, contador5=0, contador6=0;
		int max = 1000000;
		for(int i =0; i<=max; i++){
			if(dado() == 1){
				contador1++;
			}else if(dado() == 2){
				contador2++;
			}else if(dado() == 3){
				contador3++;
			}else if(dado() == 4){
				contador4++;
			}else if(dado() == 5){
				contador5++;
			}else{
				contador6++;
			}
		}
		
		System.out.println("1: "+contador1+" - "+(contador1*100.0/max)+"%");
		System.out.println("2: "+contador2+" - "+(contador2*100.0/max)+"%");
		System.out.println("3: "+contador3+" - "+(contador3*100.0/max)+"%");
		System.out.println("4: "+contador4+" - "+(contador4*100.0/max)+"%");
		System.out.println("5: "+contador5+" - "+(contador5*100.0/max)+"%");
		System.out.println("6: "+contador6+" - "+(contador6*100.0/max)+"%");
		
	}
}

