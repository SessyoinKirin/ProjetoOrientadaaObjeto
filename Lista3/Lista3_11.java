import java.util.Scanner;
public class Lista3_11 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x, soma=0;
		
		x=ler.nextInt();
		for(int i=1; i<x; i++){
			if(x%i == 0){
				soma+=i;
			}
			if(soma == x){
				System.out.println(i+" ");
			}
		}
		
	}
}

