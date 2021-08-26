import java.util.Arrays;
public class Lista0_25 {
	
	public static void main (String[] args) {
		
		int[][] a = new int[(int)((Math.random()*10)+1)][(int)((Math.random()*10)+1)];
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
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
		
	}
}
