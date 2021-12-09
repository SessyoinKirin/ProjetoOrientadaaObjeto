import java.util.Scanner;
public class UsaCalculadora {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		Calculadorax calc = new Calculadorax();
		
		int opcao =0;
		
		do{
			System.out.println("===MENU===");
			System.out.println("1)Entrar com primeiro numero");
			System.out.println("2)Entrar com segundo numero");
			System.out.println("3)Ver os numeros da calculadora");
			System.out.println("4)Somar");
			System.out.println("5)Subtrair");
			System.out.println("6)Multiplicar");
			System.out.println("7)Dividir");
			System.out.println("8)Resumo");
			System.out.println("9)Sair");
			System.out.println("-----------------------------------");
			System.out.print("Opcao: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1 :
					System.out.print("Entre com um numero: ");
					int numero = ler.nextInt();
					calc.setN1(numero);
					break;
				case 2:
					System.out.print("Entre com um numero: ");
					calc.setN2(ler.nextInt());
					break;
				case 3 :
					System.out.println("Numero 1: "+calc.getN1());
					System.out.println("Numero 2: "+calc.getN2());
					break;
				case 4:
					System.out.println("Soma: "+calc.somar());
					break;
				case 5:
					System.out.println("Subtrair: "+calc.subtrair());
					break;
				case 6:
					System.out.println("Multiplicar: "+calc.multiplicar());
					break;
				case 7:
					System.out.println("Dividir: "+calc.dividir());
					break;
				case 8:
					System.out.println("<<<<RESUMO>>>");
					System.out.println("Numero 1: "+calc.getN1());
					System.out.println("Numero 2: "+calc.getN2());
					System.out.println("Soma: "+calc.somar());
					System.out.println("Subtrair: "+calc.subtrair());
					System.out.println("Multiplicar: "+calc.multiplicar());
					System.out.println("Dividir: "+calc.dividir());
					break;
				case 9:
					System.out.println("\n\tFim do programa!\n");
					break;
				default:
					System.out.println("\n\tOpcao invalida!!\n");
			}
		}while(opcao !=9);
		
	}
}

