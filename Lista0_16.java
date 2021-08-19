public class Lista0_16 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int p[][] = new int[n][n];
		
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p[i].length; j++){
				p[i][j] = (int)(Math.random()*10);
				System.out.print(p[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Elemento abaixo da diagonal principal(inclusa) e abaixo diagonal secundaria(inclusa): ");
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p[i].length; j++){
				if(i>=j || i+j >= p.length-1){
					System.out.print(p[i][j]+"   ");
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
	}
}

