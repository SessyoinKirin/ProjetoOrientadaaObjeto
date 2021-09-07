import java.util.Scanner;
public class Lista2_1 {
	
	static boolean isMaior(int n1, int n2){
		return n1>n2;
		}
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Entre com um numero inteiro: ");
		n1 = ler.nextInt();
		System.out.print("Entre com outro numero inteiro: ");
		n2 = ler.nextInt();
		System.out.println("O maior eh:"+(isMaior(n1,n2)?" "+n1 : " "+n2));
		
		
	}
}

