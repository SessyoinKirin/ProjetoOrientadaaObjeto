import java.util.Scanner;
public class Pedido {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto produto[] = new Produto[100];
		
		int totalDeProduto = 0, opcao=0;
		double preco, quantidade;
		
		do{
			System.out.println("--M E R C A D A O--");
			System.out.println("1. ADD Frios: ");
			System.out.println("2. ADD Paozinho: ");
			System.out.println("3. ADD Doces: ");
			System.out.println("4. Ver Produtos: ");
			System.out.println("5. Sair: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					System.out.println("Qual o preco do Frio: ");
					preco = ler.nextDouble();
					System.out.println("Qual o quantidade: ");
					quantidade = ler.nextDouble();
					
					Frios frios = new Frios(preco, quantidade);
					produto[totalDeProduto] = frios;
					totalDeProduto++;
					break;
				case 2:
					System.out.println("Qual o preco do Paozinho: ");
					preco = ler.nextDouble();
					System.out.println("Qual o quantidade: ");
					quantidade = ler.nextDouble();
					
					Paozinho paozinho = new Paozinho(preco, quantidade);
					produto[totalDeProduto] = paozinho;
					totalDeProduto++;
					break;
				case 3:
					System.out.println("Qual o preco da Doce: ");
					preco = ler.nextDouble();
					System.out.println("Qual o quantidade: ");
					quantidade = ler.nextDouble();
					
					Doces doces = new Doces(preco, quantidade);
					produto[totalDeProduto] = doces;
					totalDeProduto++;
					break;
				case 4:
					System.out.println("Produtos: ");
					for(int i =0; i<totalDeProduto; i++){
						System.out.println(produto[i]);
					}
					break;
				case 5: 
					System.out.println("Fim do Programa");
					break;
				default:
					System.out.println("Valor invalida!!!!!");
			}
		}while(opcao!=5);
		
		//System.out.println(produto[0].Valor());
		double valorFinal=0.0;
		for(int i=0; i<totalDeProduto; i++){
			valorFinal+=produto[i].Valor();
		}
		System.out.println("Total: "+valorFinal);
		
	}
}

/*import java.util.Scanner;

public class CestadeFrutasV2 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Fruta cesta[] = new Fruta[100];
		
		int totalDeFrutas = 0, opcao =0, quantidade;
		String cor, tipo;
		do{
			System.out.println("M E R C A D A O");
			System.out.println("1. ADD Maca: ");
			System.out.println("2. ADD Uva: ");
			System.out.println("3. Ver Cesta: ");
			System.out.println("4. Sair: ");
			System.out.println("----------------");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					System.out.println("Qual a cor da maca: ");
					cor = leia.nextLine();
					System.out.println("Qual o tipo da maca: ");
					tipo = leia.nextLine();
					
					cesta[totalDeFrutas] = new Maca(cor, tipo);
					totalDeFrutas++;
					break;
				case 2:
					System.out.println("Qual a cor da uva: ");
					cor = leia.nextLine();
					System.out.println("Qual a quantidade da uva: ");
					quantidade = ler.nextInt();
					
					Uva uva = new Uva(cor, quantidade);
					cesta[totalDeFrutas] = uva;
					totalDeFrutas++;
					break;
				case 3:
					System.out.println("Cesta: ");
					for(int i =0; i<totalDeFrutas; i++){
						System.out.println(cesta[i]);
					}
					break;
				case 4:
					System.out.println("Fim do programa!!!");
					break;
				default:
					System.out.println("Opcao invalida!!");
			}
		}while(opcao != 4);
		
	}
}

*/
