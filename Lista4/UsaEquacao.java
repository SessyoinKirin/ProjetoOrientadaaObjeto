import java.util.Scanner;
public class UsaEquacao {
	
	public static void main (String[] args) {
		EquacaoSegundoGrau eqgrau = new EquacaoSegundoGrau();
		Scanner ler = new Scanner(System.in);
		int opcao=0;
		
		
		do{
			System.out.println("--------MENU-------");
			System.out.println("1. Digita os valores: ");
			System.out.println("2. Saber os valores: ");
			System.out.println("3. Saber a delta: ");
			System.out.println("4. Saber o resultado: ");
			System.out.println("5. Sair: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					int a;
					do{
						System.out.println("Insere o valor de A: ");
						a=ler.nextInt();
						if(a == 0){
							System.out.println("Valor invalido, nao pode ser zero!!");
						}else{
							eqgrau.setA(a);
						}
					}while(a == 0);
					System.out.println("Insere o valor B: ");
					eqgrau.setB(ler.nextInt());
					System.out.println("Insere o valor C: ");
					eqgrau.setC(ler.nextInt());
					break;
				case 2:
					System.out.println(eqgrau);
					break;
				case 3:
					System.out.println("A delta eh: "+eqgrau.Delta());
					break;
				case 4:
					System.out.println(eqgrau.TestDelta());
					break;
				case 5:
					System.out.println("Fim do programa!!!!!!!!");
					break;
				default:
					System.out.println("Valor invalido!!!");
			}
		}while(opcao!=5);
		
	}
}

