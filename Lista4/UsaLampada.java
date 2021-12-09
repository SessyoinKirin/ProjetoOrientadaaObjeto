import java.util.Scanner;
public class UsaLampada {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Lampada lampada = new Lampada();
		int opcao =0;
		
		do{
			System.out.println("--------MENU--------");
			System.out.println("1. Cadastrar modelo:");
			System.out.println("2. Ver lampada: ");
			System.out.println("3. Sair");
			opcao = leia.nextInt();
			
			switch(opcao){
				case 1: 
					System.out.println("Digite o modelo da lampada: ");
					lampada.setModelo(ler.nextLine());
					System.out.println("Digite \'true\' se a lampada esta ligada ou \'false\', fechada: ");
					//aceita caracter 0 a 1
					//lampada.setEstado(!ler.next("[0-1]").equals("0"));
					lampada.setEstado(Boolean.parseBoolean(ler.nextLine()));
					break;
				case 2:
					System.out.println(lampada);
					break;
				case 3:
					System.out.println("\n\tFim do programa!!");
					break;
				default:
					System.out.println("Valor invalido!!");
			}
			}while(opcao !=3);
		
	}
}

