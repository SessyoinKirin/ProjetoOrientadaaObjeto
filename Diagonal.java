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
		
	}
}

