import java.util.Scanner;
public class Lista1_1_1ternario {
	
	static boolean isPositivo(double valor){
		/*if(valor<0)
			throw new IllegalArgumentException("Erros no isPositivo");*/
		return valor >= 0;
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor;
		int contador=0;
		
		do{
			System.out.print("Entre com um numero: ");
			valor = ler.nextDouble();
			
			System.out.println("O numero "+valor+" eh "+(isPositivo(valor) ? "positivo." : "negativo."));
			contador++;
			}while(contador < 3);
		
	}
}

