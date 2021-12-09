import java.util.Scanner;
public class Lista0_23 {
	
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
		int numero =0, contador=0, posicao =0;
		int primo[] = new int[n*n];
		while(primo[primo.length-1] == 0){
			numero++;
			contador=0;
			for(int i=1; i<=numero; i++){
				if(numero % i == 0){
					contador++;
					}
				}
				if(contador == 2){
					primo[posicao++] = numero;
					}
			}
		posicao =0;
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				matriz[i][j] = primo[posicao++];
				System.out.print(matriz[i][j]+"  ");
				}
				System.out.println();
			}
		
	}
}

