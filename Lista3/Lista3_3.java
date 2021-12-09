import java.util.Scanner;
public class Lista3_3 {
	
	static void lerTemp(){
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		double temp;
		char resp;
		do{
			System.out.print("[C]Celsius, [F]Fahrenheit, [K]Kelvin e [S]Sair: ");
			resp = ler.nextLine().toLowerCase().charAt(0);
			if(resp == 'c'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextDouble();
				System.out.println("Saida: "+modifyCtoFTemp(temp)+"F");
				System.out.println("Saida: "+modifyCtoKTemp(temp)+"K");
				System.out.println("Calculo: [F = ( 9 * "+temp+" / 5 ) + 32]");
				System.out.println("Calculo: [k = "+temp+" +273]");
			}else if(resp == 'f'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextDouble();
				System.out.println("Saida: "+modifyFtoCTemp(temp)+"C");
				System.out.println("Saida: "+modifyFtoKTemp(temp)+"K");
				System.out.println("Calculo: [ C = 5 * ( "+temp+" - 32 ) / 9]");
				System.out.println("Calculo: [ K =( 5 * ( "+temp+" - 32 ) / 9 )+ 273]");
			}else if(resp == 'k'){
				System.out.print("Entre com a temperatura: ");
				temp = leia.nextDouble();
				System.out.println("Saida: "+modifyKtoCTemp(temp)+"C");
				System.out.println("Saida: "+modifyKtoFTemp(temp)+"F");
				System.out.println("Calculo: [ C = "+temp+" - 273]");
				System.out.println("Calculo: [ F = (9 * ("+temp+" - 273) / 5 )+ 32]");


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
	
	static double modifyCtoKTemp(double temp){
		double resultado;
		resultado = temp + 273;
		return resultado;
	}
	
	static double modifyFtoCTemp(double temp){
		double resultado;
		resultado = 5*(temp - 32)/9;
		return resultado;
	}
	
	static double modifyFtoKTemp(double temp){
		double resultado;
		resultado = (5*(temp-32)/9)+273;
		return resultado;
	}
	
	static double modifyKtoCTemp(double temp){
		double resultado;
		resultado = temp-273;
		return resultado;
	}
	
	static double modifyKtoFTemp(double temp){
		double resultado;
		resultado = (9*(temp-273)/5)+32;
		return resultado;
	}
	
	public static void main (String[] args) {
		
		lerTemp();
	}
}

