import java.util.Scanner;
public class Lista1_1 {
	
	static boolean isPositivo(double valor){
		return valor >= 0;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor;
		int contador=0;
		
		do{
			System.out.print("Entre com um numero: ");
			valor = ler.nextDouble();
			
			if(isPositivo(valor)){
				System.out.println("O numero "+valor+" eh positivo");
				}else{
					System.out.println("O numero "+valor+" eh negativo");
					}
				contador++;
			}while(contador <= 3);
		
	}
}

