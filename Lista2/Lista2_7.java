import java.util.Scanner;
public class Lista2_7 {
	
	static void dado(){
		int n1;
		n1 = (int)((Math.random()*6)+1);
		System.out.println("Saiu: "+n1);
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		char resp;
		
		do{
			System.out.print("Jogar dado[s/n]: ");
			resp = ler.nextLine().charAt(0);
			if(resp == 'S' || resp == 's'){
				dado();
				}
			}while(resp == 'S' || resp == 's');
		
		
	}
}

