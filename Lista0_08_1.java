public class Lista0_08_1 {
	
	public static void main (String[] args) {
		
		int n, m, contimpar =0, contpar =0, z=0, y=0;
		n = (int)((Math.random()*9)+1);
		m = (int)((Math.random()*9)+1);
		int f[][] = new int[n][m];
		int[] par, impar;
		
		for(int i=0; i<f.length; i++){
			for(int j=0; j<f[i].length; j++){
				f[i][j] = (int)(Math.random()*9);
				System.out.print(f[i][j]+"  ");
				}
				System.out.println("\n\n");
			}
		for(int i=0; i<f.length; i++){
			for(int j=0; j<f[i].length; j++){
				if(f[i][j]%2==0){
					contpar++;
					}
				if(f[i][j]%2==1){
					contimpar++;
					}
				}
			}
		
		if(contpar ==0){
			System.out.println("Nao ha valor par");
			}else{
				if(contimpar == 0){
					System.out.println("Nao ha valor impar");
					}
				}
			
				if(contpar >0){
					System.out.println("Vetor par");
					par = new int[contpar];
					for(int i=0; i<f.length; i++){
						for(int j=0; j<f[i].length; j++){
							if(f[i][j]%2 == 0){
								par[z]=f[i][j];
								System.out.print(par[z]+" ");
								z++;
								}
							}
						}
					}
					System.out.println();
					if(contimpar >0){
					System.out.println("Vetor impar: ");
					impar = new int[contimpar];
					for(int i=0; i<f.length; i++){
						for(int j=0; j<f[i].length; j++){
							if(f[i][j]%2 == 1){
								impar[y]=f[i][j];
								System.out.print(impar[y]+" ");
								y++;
								}
							}
						}
					}
				
	}
}

