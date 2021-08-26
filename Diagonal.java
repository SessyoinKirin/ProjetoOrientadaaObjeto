import java.util.Scanner;
public class  Diagonal{
	
	public static void main (String[] args) {
		
		int [][] m = new int[9][9];
		
		System.out.println("Matriz principal: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i == j){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		System.out.println();
		System.out.println("Matriz secundaria: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i + j == m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz acima da diagonal principal: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i <= j){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz abaixo da diagonal principal: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i >= j){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		System.out.println("Matriz acima da secundaria: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i + j <= m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		System.out.println("Matriz abaixo secundaria: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i + j >= m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("__");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz X: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i == j || i+j == m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("_ ");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz X: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i == j || i+j == m.length -1){
					System.out.print("_ ");
				}else{
					
					System.out.print(m[i][j]+" ");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz triangulo superior: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i <= j && i+j <= m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("_ ");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz triangulo direita: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i >= j && i+j <= m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("_ ");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz triangulo esquerda: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if(i <= j && i+j >= m.length -1){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("_ ");
					}
			}
				System.out.println();
		}
		
		System.out.println("Matriz triangulo esquerda: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				System.out.print(m[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("Matriz triangulo esquerda: ");
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if((i==6 && j==0)||(i==5 && j==1)||(i==4 && j==2)||(i==4 && j==3)||(i==4 && j==4)||(i==4 && j==5)||(i==3 && j==6)||(i==2 && j==6)||(i==1 && j==6)||(i==2 && j==2)){
					System.out.print(m[i][j]+" ");
				}else{
					System.out.print("_ ");
					}
			}
				System.out.println();
		}
	}
}

