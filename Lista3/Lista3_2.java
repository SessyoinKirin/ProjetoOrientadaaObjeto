import java.util.Scanner;
public class Lista3_2 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		int temp;
		char resp;
		
		do{
			System.out.print("[C]Celsius, [F]Fahrenheit e [S]Sair: ");
			resp = ler.nextLine().charAt(0);
			if(resp == 'C'||resp == 'c'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextInt();
				}else if(resp == 'F'||resp == 'f'){
					System.out.print("Entre com a temperatura: ");
					temp = leia.nextInt();
					}
			}while(resp != 'S'||resp != 's');
		
	}
}

