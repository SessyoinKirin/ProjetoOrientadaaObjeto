import java.util.Scanner;
public class Lista3_6 {
	
	static void primo(int n1, int n2){
		int contador=0, k=0, l=0;
		for(int i = Math.min(n1, n2); i<=Math.max(n1, n2); i++){
			contador=0;
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					contador++;
				}
			}if(contador == 2){
				k++;
			}
		}
		int array[] = new int[k];
		for(int i = Math.min(n1, n2); i<=Math.max(n1, n2); i++){
			contador=0;
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					contador++;
				}
			}if(contador == 2){
				array[l++]=i;
			}
		}
		System.out.print(">> ");
		for(int i =0; i<array.length; i++){
			System.out.print(" "+array[i]);
		}
	}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Entre com um valor: ");
		n1 = ler.nextInt();
		System.out.print("Entre com outro valor: ");
		n2 = ler.nextInt();
		
		primo(n1, n2);
	}
}

