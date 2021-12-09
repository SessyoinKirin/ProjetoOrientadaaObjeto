import java.util.Scanner;
public class Lista0_04 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n, m, valorMax;
		
		do{
			System.out.print("Digite a linha da matriz: ");
			n = ler.nextInt();
			System.out.print("Digite a coluna da matriz: ");
			m = ler.nextInt();
			if(n<0 || m<0){
				System.out.println("Valor invalida!!");
				}
			}while(n<0 || m<0);
		do{
			System.out.print("Digite o valor maximo dos elementos: ");
			valorMax = ler.nextInt();
			if(valorMax<1){
				System.out.println("Valor invalida!!");
				}
			}while(valorMax<1);
		int d[][] = new int[n][m];
		for(int i=0; i<d.length; i++){
			for(int j=0; j<d[i].length; j++){
				d[i][j] = (int)((Math.random()*valorMax)+1);
				System.out.print(d[i][j]+"  ");
				}
				System.out.println("\n");
			}
		
	}
}

