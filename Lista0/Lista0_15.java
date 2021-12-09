public class Lista0_15 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int o[][] = new int[n][n];
		
		for(int i=0; i<o.length; i++){
			for(int j=0; j<o[i].length; j++){
				o[i][j] = (int)(Math.random()*10);
				System.out.print(o[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento abaixo da diagonal principal(inclusa) e acima diagonal secundaria(inclusa): ");
		for(int i=0; i<o.length; i++){
			for(int j=0; j<o[i].length; j++){
				if(i>=j || i+j <= o.length-1){
					System.out.print(o[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

