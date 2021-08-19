public class Lista0_09 {
	
	public static void main (String[] args) {
		
		int n = (int)((Math.random()*9)+1);
		int g[][] = new int[n][n];
		
		for(int i =0; i<g.length; i++){
			for(int j=0; j<g[i].length; j++){
				g[i][j] = (int)(Math.random()*10);
				System.out.print(g[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("\nElemento de diagonal principal: ");
		for(int i =0; i<g.length; i++){
			for(int j=0; j<g[i].length; j++){
				if(i == j){
					System.out.print(g[i][j]+" ");
					}
				}
			}
		
	}
}

