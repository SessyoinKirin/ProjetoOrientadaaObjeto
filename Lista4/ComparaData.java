import java.util.Scanner;
public class ComparaData {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner lia = new Scanner(System.in);
		Data data = new Data();
		int opcao=0;
		
		do{
			System.out.println("------MENU------");
			System.out.println("1. Entrar data: ");
			System.out.println("2. Ver data: ");
			System.out.println("3. Entrar outra data: ");
			System.out.println("4. Comparar: ");
			System.out.println("5. Sair: ");
			System.out.println("----------------");
			opcao = ler.nextInt();
			switch(opcao){
				case 1:
					System.out.print("Entre um dia: ");
					data.isDia(ler.nextInt());
					
					System.out.print("Entre um mes: ");
					data.isMes(ler.nextInt());
					
					System.out.print("Entre um ano: ");
					data.isAno(ler.nextInt());
					
					System.out.println("Sao "+data.getDias1()+" dias");
					break;
				case 2:
					System.out.println(data);
					break;
				case 3:
					System.out.print("Entre um dia: ");
					data.isDia(ler.nextInt());
					
					System.out.print("Entre um mes: ");
					data.isMes(ler.nextInt());
					
					System.out.print("Entre um ano: ");
					data.isAno(ler.nextInt());
					
					System.out.println("Sao "+data.getDias2()+" dias");
					break;
				case 4:
					System.out.println(data.isMaior()?"A primeira data eh maior":"A segunda data eh maior");
					break;
				case 5:
					System.out.println("Fim do programa!!!");
					break;
				default:
					System.out.println("Valor invalido!!!!");
			}
			
		}while(opcao!=5);
		
	}
}

