import java.util.Scanner;
public class UsaNumero {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Numero num = new Numero();
		
		int valor =0;
		
		do{
			System.out.print("Entre com um numero: ");
			valor = ler.nextInt();
			if(valor >=0){
				num.setN(valor);
				System.out.println("O inverso do numero eh: "+num.inverter());
				System.out.println("\nO numero "+(num.ehPrimo()?"eh" : "n eh")+" primo");
			}
		}while(valor >= 0);
		System.out.println("\n\tFim do programa!!!!!!!!!!!!\n");
	}
}

