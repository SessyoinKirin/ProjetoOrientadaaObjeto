import java.util.Scanner;
public class Lista0_24 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		do{
			System.out.print("Digite uma dimensao da matriz: ");
			n = ler.nextInt();
			if(n<=0){
				System.out.println("Valor invalido!!");
				}
			}while(n<=0);
		int matriz[][] = new int[n][n];
		int numero =0, a=0, b=1, c, posicao =0;
		int fibo[] = new int[n*n];
		while(fibo[fibo.length-1] == 0){
			fibo[posicao++] = a;
			c=b+a;
			a=b;
			b=c;
			}
		posicao =0;
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				matriz[i][j] = fibo[posicao++];
				System.out.print(matriz[i][j]+"  ");
				}
				System.out.println();
			}
		
	}
}

