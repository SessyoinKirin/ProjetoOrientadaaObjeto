import java.util.Scanner;
public class Lista2_6 {
	
	static int menor(int n1, int n2){
		if(n1 < n2){
			return n1;
			}else{
				return n2;
				}
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		char resp;
		
		System.out.print("Entre com um numero inteiro: ");
		n1=ler.nextInt();
		System.out.print("Inserir outro[s/n]: ");
		resp = leia.nextLine().charAt(0);
		
			do{
				System.out.print("Entre com um numero inteiro: ");
				n2=ler.nextInt();
				menor(n1, n2);
				n1 = menor(n1, n2);
				System.out.print("Inserir outro[s/n]: ");
				resp = leia.nextLine().charAt(0);
				}while(resp == 'S' || resp == 's');
			if(resp == 'N' || resp == 'n'){
				System.out.println("O menor eh: "+n1);
				}
		
	}
}

