import java.util.Scanner;
public class Lista2_5 {
	
	static int isMaior(int n1, int n2, int n3){
		int maioh = Math.max(n1, n2);
		return Math.max(maioh, n3);
		}
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Entre com um numero inteiro: ");
		n1 = ler.nextInt();
		System.out.print("Entre com outro numero inteiro: ");
		n2 = ler.nextInt();
		System.out.print("Entre com mais um numero inteiro: ");
		n3 = ler.nextInt();
		System.out.println("O maior eh: "+(isMaior(n1, n2, n3)));
		
		
	}
}

