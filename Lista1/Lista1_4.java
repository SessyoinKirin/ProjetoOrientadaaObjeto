import java.util.Scanner;
public class Lista1_4 {
	
	static int delTa(int n1, int n2, int n3){
		return n2*n2-4*n1*n3;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, contador=0;
		
		do{
			do{
				System.out.print("Digite o valor a: ");
				n1=ler.nextInt();
				if(n1<=0){
					System.out.println("Valor invalida!!Digite um valor maior que zero!!");
					}
			}while(n1<=0);
			System.out.print("Digite mais um valor: ");
			n2=ler.nextInt();
			System.out.print("Digite outro valor: ");
			n3=ler.nextInt();
			System.out.println("Delta eh: "+delTa(n1, n2, n3));
			contador++;
			}while(contador <2);
		
	}
}

