public class Lista0_14 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int l[][] = new int[n][n];
		
		for(int i=0; i<l.length; i++){
			for(int j=0; j<l[i].length; j++){
				l[i][j] = (int)(Math.random()*10);
				System.out.print(l[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento acima da diagonal secundaria: ");
		for(int i=0; i<l.length; i++){
			for(int j=0; j<l[i].length; j++){
				if(i+j <= l.length-1){
					System.out.print(l[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

