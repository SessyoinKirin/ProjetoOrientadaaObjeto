import java.util.Scanner;
public class Lista0_05 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n, m, valorMax;
		
		do{
			System.out.print("Digite a linha da matriz: ");
			n = ler.nextInt();
			System.out.print("\nDigite a coluna da matriz: ");
			m = ler.nextInt();
			if(n<0 || m<0){
				System.out.println("Valor invalido!!!");
				}
			}while(n<0 || m<0);
		System.out.println();
		do{
			System.out.print("Digite o valor maxima: ");
			valorMax = ler.nextInt();
			}while(valorMax<1);	
		
		int[][] a, b, c;
		a = new int[n][m];
		b = new int[n][m];
		c = new int[n][m];
		System.out.println("\n\nMatriz A: \n");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = (int)((Math.random()*valorMax)+1);
				System.out.print(a[i][j]+"  ");
				}
				System.out.println("\n");
			}
		System.out.println("\n\nMatriz B: \n");
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				b[i][j] = (int)((Math.random()*valorMax)+1);
				System.out.print(b[i][j]+"  ");
				}
				System.out.println("\n");
			}
		System.out.println("\n\nMatriz C: \n");
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"  ");
				}
				System.out.println("\n");
			}
		
		
	}
}

