import java.util.Scanner;

public class Lista0_01 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz1[][] = new int[4][5];
		
		for(int i = 0; i<matriz1.length; i++){
			
			for(int j=0; j<matriz1[i].length; j++){
				System.out.print("Entre com um numero na posicao["+i+"]["+j+"]: ");
				matriz1[i][j]= ler.nextInt();
				}
				System.out.println();
			}
		System.out.println("Mostrando os elementos: ");
		for(int i=0; i<matriz1.length; i++){
			for(int j=0; j<matriz1[i].length; j++){
				System.out.print(matriz1[i][j]+"   ");
				}
				System.out.println();
			}
		
	}
}

