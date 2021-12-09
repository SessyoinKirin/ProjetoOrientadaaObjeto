import java.text.DecimalFormat;
import java.util.Scanner;
public class UseWaiter {
	
	public static void main (String[] args) {
		Waiter waiter = new Waiter();
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		int valor, pessoas;
		String resposta;
		do{
			System.out.print("O valor da conta a ser paga: ");
			valor = ler.nextInt();
			if(valor <10000 && valor>50){
				waiter.setPreco(valor);
			}else{
				System.out.println("Valor absurdo!!");
			}
		}while(valor >10000 || valor<=50);
		System.out.println();
		do{
			System.out.print("Quantas pessoas: ");
			pessoas = ler.nextInt();
			if(pessoas <15 && pessoas>1){
				waiter.setPeople(pessoas);
			}else{
				System.out.println("Valor absurdo!!");
			}
		}while(pessoas>15 || pessoas<=1);
		System.out.println();
		System.out.println("Deseja pagar garcom [S/N]?");
		resposta= leia.nextLine();
		if(resposta.equalsIgnoreCase("s")){
			System.out.println("O valor a ser pago por cada pessoa eh: "+df.format(waiter.GiveMoneyToWaiter()));
		}else{
			System.out.println("O valor a ser pago por cada pessoa eh: "+df.format(waiter.NoGiveMoneyToWaiter()));
		}
		
	}
}

