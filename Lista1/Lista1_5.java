import java.util.Scanner;
public class Lista1_5 {
	
	static int delTa(int n1, int n2, int n3){
		return n2*n2-4*n1*n3;
		}
	
	static boolean isPositivo(double delTa){
		return delTa>=0;
		}
	
	static boolean isZero(double delTa){
		return delTa==0;
		}	
	
	static double raiza(int n1, int n2, int n3, double delta){
		return ((-n2)+(Math.sqrt(delta)))/2*n1;
		}
	
	static double raizb(int n1, int n2, int n3, double delta){
		return ((-n2)-(Math.sqrt(delta)))/2*n1;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
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
		double delta = delTa(n1, n2, n3);
		if(isZero(delta)){
			System.out.println("So existe um rais real");
				System.out.println("A raiz eh: "+raiza(n1, n2, n3, delta));
			}else if(isPositivo(delta)){
				System.out.println("As raizes sao reais");
				System.out.println("A raiz\' eh: "+raiza(n1, n2, n3, delta));
				System.out.println("A raiz\" eh: "+raizb(n1, n2, n3, delta));
				}else{
					System.out.println("As raizes sao complexas, e retornando 0");
					}
	}
}

