import java.util.Scanner;
public class Lista0_03 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("Digite o dimensao da matriz: ");
			n=ler.nextInt();
			if(n>20 || n<0){
				System.out.println("Valor invalido!!");
				}
			}while(n>20 || n<0);
		int c[][] = new int[n][n];
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				c[i][j] = (int)(Math.random()*100);
				System.out.print(c[i][j]+"   ");
				}
				System.out.println("\n");
			}
		
	}
}

