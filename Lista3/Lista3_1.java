import java.util.Scanner;
public class Lista3_1 {
	
	static double transfer(int n1){
		return (9*n1/5)+32;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int celso;
		System.out.print("Entre com temperatura em Celsius: ");
		celso=ler.nextInt();
		System.out.println("A temperatura em Fahrenheit eh: "+transfer(celso));
		
	}
}

