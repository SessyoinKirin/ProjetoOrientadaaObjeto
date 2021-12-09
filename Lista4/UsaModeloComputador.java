import java.util.Scanner;
public class UsaModeloComputador {
	
	public static void main (String[] args) {
		
		ModeloDeComputador md = new ModeloDeComputador();
		Scanner ler = new Scanner(System.in);
		int opcao, resp;
		int cont =0;
		
		do{
			System.out.println("Eae mano vai comprar o que?");
			System.out.println("1. Placa mae: ");
			System.out.println("2. Processadores: ");
			System.out.println("3. Memoria: ");
			System.out.println("4. Disco Rigido: ");
			System.out.println("5. Monitor: ");
			System.out.println("6. Fechar a conta: ");
			System.out.println("7. Sair: ");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					md.setPlacaMae(800);
					break;
				case 2:
					cont =0;
					do{
						System.out.println("A gente tem de 1600Mhz, 1800Mhz e 1900Mhz");
						System.out.println("1. 1600Mhz");
						System.out.println("2. 1800Mhz");
						System.out.println("3. 1900Mhz");
						resp = ler.nextInt();
						
						switch(resp){
							case 1:
								md.setProcessadores(700);
								cont+=2;
								break;
							case 2:
								md.setProcessadores(830);
								cont+=2;
								break;
							case 3:
								md.setProcessadores(910);
								cont+=2;
								break;
							default:
								System.out.println("Valor invalida!!!!");
						}
					}while(cont != 2);
					break;
				case 3:
					cont =0;
					do{
						System.out.println("Que tamannho de memoria vc quer!?");
						System.out.println("1. 1GB: ");
						System.out.println("2. 2GB: ");
						System.out.println("3. 4GB: ");
						System.out.println("4. 6GB: ");
						System.out.println("5. 8GB: ");
						resp = ler.nextInt();
						
						switch(resp){
							case 1:
								md.setMemoria((350*1));
								cont+=2;
								break;
							case 2:
								md.setMemoria((350*2));
								cont+=2;
								break;
							case 3:
								md.setMemoria((350*4));
								cont+=2;
								break;
							case 4:
								md.setMemoria((350*6));
								cont+=2;
								break;
							case 5:
								md.setMemoria((350*8));
								cont+=2;
								break;
							default:
								System.out.println("Valor invalida!!!!");
						}
					}while(cont!=2);
					break;
				case 4:
					cont =0;
					do{
						System.out.println("Vai pegar disco rigido memo?");
						System.out.println("1. 500GB: ");
						System.out.println("2. 1TB: ");
						System.out.println("3. 2TB: ");
						resp = ler.nextInt();
					
						switch(resp){
							case 1:
								md.setDiscoRigido(300);
								cont+=2;
								break;
							case 2:
								md.setDiscoRigido(420);
								cont+=2;
								break;
							case 3:
								md.setDiscoRigido(500);
								cont+=2;
								break;
							default:
								System.out.println("Valor invalido!!!!!");
						}
					}while(cont !=2);
					break;
				case 5:
					cont = 0;
					do{
						System.out.println("1. 15 polegadas: ");
						System.out.println("2. 17 polegadas: ");
						resp = ler.nextInt();
						
						switch(resp){
							case 1:
								md.setMonitor(320);
								cont+=2;
								break;
							case 2:
								md.setMonitor(520);
								cont+=2;
								break;
							default:
								System.out.println("Valor invalida!!!!");
						}
					}while(cont!=2);
					break;
				case 6:
					System.out.println("O valor ficou: "+md.soma()+" reais");
					break;
				case 7:
					System.out.println("Fim do programa!!!!!");
					break;
				default:
					System.out.println("Valor invalida!!!!!!");
			}
		}while(opcao !=7);
		
	}
}

