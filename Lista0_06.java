import java.util.Scanner;

public class Lista0_06 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, m, valor, ocorrencia=0;
		n = (int)((Math.random()*24)+1);
		m = (int)((Math.random()*24)+1);
		
		System.out.print("Digite um valor: ");
		valor = ler.nextInt();
		
		int a[][] = new int[n][m];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+"  ");
				if(valor == a[i][j]){
					ocorrencia++;
					}
				}
				System.out.println("\n\n");
			}
			
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = (int)(Math.random()*100);
				if(valor == a[i][j]){
					System.out.println("O valor "+valor+" apareceu na linha"+i+" e coluna "+j);
					}
				}
				
			}System.out.println("Foi total de "+ocorrencia+" vezes");
		
	}
}

