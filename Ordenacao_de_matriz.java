import java.util.Arrays;
public class Ordenacao_de_matriz {
	
	public static void main (String[] args) {
		
		//int[] a = {3, 1, 6, 8, 9}; uma forma de array
		int[][] a = new int[2][5];
		System.out.println("matriz A original: ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = (int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println();
		System.out.println("matriz A modificada: ");
		for(int i=0; i<a.length; i++){
			Arrays.sort(a[i]);
			}
		for(int i=0; i<a.length; i++){//versao invertida
			for(int j=a[i].length-1; j>=0; j--){
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
		
	}
}
