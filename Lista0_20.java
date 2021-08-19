public class Lista0_20 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int t[][] = new int[n][n];
		
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t[i].length; j++){
				t[i][j] = (int)(Math.random()*10);
				System.out.print(t[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Ampulheta: ");
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t[i].length; j++){
				if(i<=j || i+j >= t.length-1){
					if(i<j && i+j > t.length-1){
						System.out.print("    ");
						}else{
							System.out.print(t[i][j]+"   ");
							}
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
		
	}
}

