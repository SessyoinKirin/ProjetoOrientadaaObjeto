public class Lista0_17 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int q[][] = new int[n][n];
		
		for(int i=0; i<q.length; i++){
			for(int j=0; j<q[i].length; j++){
				q[i][j] = (int)(Math.random()*10);
				System.out.print(q[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento acima da diagonal principal(inclusa) e abaixo diagonal secundaria(inclusa): ");
		for(int i=0; i<q.length; i++){
			for(int j=0; j<q[i].length; j++){
				if(i<=j || i+j >= q.length-1){
					System.out.print(q[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

