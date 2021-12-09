public class Lista0_18 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int r[][] = new int[n][n];
		
		for(int i=0; i<r.length; i++){
			for(int j=0; j<r[i].length; j++){
				r[i][j] = (int)(Math.random()*10);
				System.out.print(r[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento acima da diagonal principal(inclusa) e acima diagonal secundaria(inclusa): ");
		for(int i=0; i<r.length; i++){
			for(int j=0; j<r[i].length; j++){
				if(i<=j || i+j <= r.length-1){
					System.out.print(r[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

