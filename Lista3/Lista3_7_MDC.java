import java.util.Scanner;

public class Lista3_7_MDC {
	
	static void mdc(int n1, int n2){
		int maior, menor, resto;
		maior = Math.max(n1, n2);
		menor = Math.min(n1, n2);
		while(menor != 0){
			resto = maior % menor;
			maior = menor;
			menor = resto;
		}
		System.out.println("MDC: "+maior);
	}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Entre com um valor: ");
		n1= ler.nextInt();
		System.out.print("Entre com outro valor: ");
		n2= ler.nextInt();
		
		mdc(n1, n2);
	}
}

