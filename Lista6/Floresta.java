import java.util.Scanner;
public class Floresta {
	
	public static void main (String[] args) {
		
		Plantas plantas[] = new Plantas[100];
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		int totalDePlantas=0, opcao=0;
		String nome, especie, cor, resposta;
		
		do{
			System.out.println("--F L O R E S T A--");
			System.out.println("1. ADD arvore: ");
			System.out.println("2. ADD flor: ");
			System.out.println("3. ADD carnivora: ");
			System.out.println("4. Ver quantidade: ");
			//System.out.println("5. Ver quantidade total: ");
			System.out.println("5. Ver floresta: ");
			System.out.println("6. Sair: ");
			System.out.println("----------------------------");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					System.out.println("Qual o nome: ");
					nome = leia.nextLine();
					System.out.println("Qual a especie: ");
					especie = leia.nextLine();
					System.out.println("Eh frutifera[S/N]: ");
					resposta = leia.nextLine();
					
					plantas[totalDePlantas] = new Arvore(nome, especie, resposta.equalsIgnoreCase("s"));
					totalDePlantas++;
					break;
				case 2:
					System.out.println("Qual o nome: ");
					nome = leia.nextLine();
					System.out.println("Qual a especie: ");
					especie = leia.nextLine();
					System.out.println("Qual a cor: ");
					cor = leia.nextLine();
					
					plantas[totalDePlantas] = new Flor(nome, especie, cor);
					totalDePlantas++;
					break;
				case 3:
					System.out.println("Qual o nome: ");
					nome = leia.nextLine();
					System.out.println("Qual a especie: ");
					especie = leia.nextLine();
					System.out.println("Eh venenosa[S/N]: ");
					resposta = leia.nextLine();
					
					plantas[totalDePlantas] = new Carnivora(nome, especie, resposta.equalsIgnoreCase("s"));
					totalDePlantas++;
					break;
				case 4:
					/*Arvore arvore = new Arvore();
					System.out.println("Arvore: "+arvore.getAquantidade());
					Flor flor = new Flor();
					System.out.println("Flor: "+flor.getFquantidade());
					Carnivora carnivora = new Carnivora();
					System.out.println("Carnivora: "+carnivora.getCquantidade());
					
					System.out.println("Quantidade total: "+(arvore.getAquantidade()+flor.getFquantidade()+carnivora.getCquantidade()));
					break;*/
					int arvore=0, flor=0, carnivora=0;
					for(int i=0; i<totalDePlantas; i++){
						if(plantas[i] instanceof Arvore){
							arvore++;
						}else if(plantas[i] instanceof Flor){
							flor++;
						}else{
							carnivora++;
						}
					}
					System.out.println("Arvore: "+arvore);
					System.out.println("Flor: "+flor);
					System.out.println("Carnivora: "+carnivora);
					System.out.println("Total: "+totalDePlantas);
					break;
				case 5:
					System.out.println("Floresta: ");
					for(int i=0; i<totalDePlantas; i++){
						System.out.println(plantas[i]);
					}
					break;
				case 6:
					System.out.println("Fim do programa!!!!");
					break;
				default:
					System.out.println("Valor invalida!!!!!!");
			}
			
		}while(opcao!=6);
		
		
	}
}
/*System.out.print("Esta fazendo aniversario[S/N]");
					resposta = leia.nextLine();
					pessoa.fazAniversario(resposta.equalsIgnoreCase("s"));
					break;*/

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


