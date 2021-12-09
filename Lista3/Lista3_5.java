import java.util.Scanner;
public class Lista3_5 {
	
	static boolean compPrimo(int n1, int i){
		
		return n1 == i;
	}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1;
		int contador = 0, primo=0, k=0;
		int array[] = new int[168];
			for(int i=2; i<=1000; i++){
				contador=0;
				for(int j=1; j<=i; j++){
					if(i%j == 0){
						contador++;
					}
				}if(contador == 2){
					//System.out.print(" "+i);
					array[k++]=i;
					
				}
			}
		
		//System.out.println("Primo no mil: "+primo);
		
		System.out.print("Entre com um numero: ");
		n1 = ler.nextInt();
		for(int i=0; i<array.length; i++){
			if(n1 == array[i]){
				//compPrimo(n1, i);
				System.out.println("A resp: "+compPrimo(n1, array[i]));
			}
		}
		
		
	}
}

