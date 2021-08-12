
public class Lista0_02 {
	
	public static void main (String[] args) {
		
		int matriz2[][] = new int[6][3];
		
		for(int i=0; i<matriz2.length; i++){
			for(int j=0; j<matriz2[i].length; j++){
				matriz2[i][j] = (int)(Math.random()*100);
				System.out.print(matriz2[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		for(int i = matriz2.length-1; i>=0; i--){
			for(int j = matriz2[i].length-1; j>=0; j--){
				System.out.print(matriz2[i][j]+"  ");
				}
				System.out.println();
			}
		
	}
}

