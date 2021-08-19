public class Lista0_07 {
	
	public static void main (String[] args) {
		
		int n, m, maior, menor;
		n = (int)((Math.random()*25)+1);
		m = (int)((Math.random()*25)+1);
		int e[][] = new int[n][m];
		
		for(int i=0; i<e.length; i++){
			for(int j=0; j<e[i].length; j++){
				e[i][j] = (int)(Math.random()*100);
				System.out.print(e[i][j]+"  ");
				}
				System.out.println("\n\n");
			}
		maior = e[0][0];
		menor = e[0][0];
		
		for(int i=0; i<e.length; i++){
			for(int j=0; j<e[i].length; j++){
				if(e[i][j] > maior){
					maior = e[i][j];
					}
				if(e[i][j] < menor){
					menor = e[i][j];
					}
				}
			}
			
		for(int i=0; i<e.length; i++){
			for(int j=0; j<e[i].length; j++){
				if(maior == e[i][j]){
					System.out.println("O maior numero eh: "+maior+" na posicao ["+i+"] ["+j+"]");
					}
				if(menor == e[i][j]){
					System.out.println("O maior numero eh: "+menor+" na posicao ["+i+"] ["+j+"]");
					}
				}
			}
		
	}
}

