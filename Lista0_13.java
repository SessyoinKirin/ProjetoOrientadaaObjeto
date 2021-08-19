public class Lista0_13 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int k[][] = new int[n][n];
		
		for(int i=0; i<k.length; i++){
			for(int j=0; j<k[i].length; j++){
				k[i][j] = (int)(Math.random()*10);
				System.out.print(k[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento abaixo da diagonal secundaria: ");
		for(int i=0; i<k.length; i++){
			for(int j=0; j<k[i].length; j++){
				if(i+j > k.length-1){
					System.out.print(k[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

