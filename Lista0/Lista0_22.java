public class Lista0_22 {
	
	public static void main (String[] args) {
		
		int[][] m1, m2, m3;
		int n = (int)((Math.random()*9)+1);
		int m = (int)((Math.random()*9)+1);
		int p = (int)((Math.random()*9)+1);
		m1 = new int[n][m];
		m2 = new int[n][p];
		m3 = new int[n][m+p];
		int coluna =0, menor, maior;
		
		System.out.println("\nMatriz 1: ");
		for(int i=0; i<m1.length; i++){
			for(int j=0; j<m1[i].length; j++){
				m1[i][j] = (int)((Math.random()*9)+1);
				System.out.print(m1[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("\nMatriz 2: ");
		for(int i=0; i<m2.length; i++){
			for(int j=0; j<m2[i].length; j++){
				m2[i][j] = (int)((Math.random()*9)+1);
				System.out.print(m2[i][j]+"   ");
				}
				System.out.println("\n");
			}
		
		menor = Math.min(m,p);
		maior = Math.max(m,p);
		
		System.out.println("\nMatriz 3: ");
		for(int i=0; i<m3.length; i++){
			coluna=0;
			for(int j=0; j<menor; j++){
				m3[i][coluna++] = m1[i][j];
				m3[i][coluna++] = m2[i][j];
				}
			//coluna =menor;
			for(int j=menor; j<m1[i].length; j++){
				m3[i][coluna] = m1[i][j];
				coluna++;
				}
			for(int j=menor; j<m2[i].length; j++){
				m3[i][coluna] = m2[i][j];
				coluna++;
				}
			}
		
		for(int i=0; i<m3.length; i++){
			for(int j=0; j<m3[i].length; j++){
				
				System.out.print(m3[i][j]+"   ");
				}
				System.out.println("\n");
			}
	}
}

