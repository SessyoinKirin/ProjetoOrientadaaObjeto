import java.util.Scanner;
public class Lista3_2_2 {
	
	static void lerTemp(){
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		double temp;
		char resp;
		do{
			System.out.print("[C]Celsius, [F]Fahrenheit e [S]Sair: ");
			resp = ler.nextLine().toLowerCase().charAt(0);
			if(resp == 'c'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextDouble();
				System.out.println("Saida: "+modifyCtoFTemp(temp));
				System.out.println("Calculo: [F = ( 9 * "+temp+" / 5 ) + 32]");
			}else if(resp == 'f'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextDouble();
				System.out.println("Saida: "+modifyFtoCTemp(temp));
				System.out.println("Calculo: [ C = 5 * ( "+temp+" - 32 ) / 9]");
			}else if(resp =='s'){
				System.out.println();
			}else{
				System.out.println("Opcao invalida!!");
				}
		}while(resp !='s');
	}
	
	static double modifyCtoFTemp(double temp){
		double resultado;
		resultado = (9*temp/5)+32;
		return resultado;
	}
	
	static double modifyFtoCTemp(double temp){
		double resultado;
		resultado = 5*(temp - 32)/9;
		return resultado;
	}
	
	public static void main (String[] args) {
		
		lerTemp();
	}
}

