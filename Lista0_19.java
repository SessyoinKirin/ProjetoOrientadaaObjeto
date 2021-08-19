public class Lista0_19 {
	
	public static void main (String[] args) {
		
		int n= (int)((Math.random()*9)+1);
		int s[][] = new int[n][n];
		
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				s[i][j] = (int)(Math.random()*10);
				System.out.print(s[i][j]+"   ");
				}
				System.out.println("\n");
			}
		System.out.println("Asa de borboleta: ");
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				if(i>=j || i+j >= s.length-1){
					if(i>j && i+j > s.length-1){
						System.out.print("    ");
						}else{
							System.out.print(s[i][j]+"   ");
							}
					}else{
						System.out.print("    ");
						}
				}
				System.out.println("\n");
			}
		
	}
}

