import java.util.Scanner;
public class UsaPessoal {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		Pessoal pessoal = new Pessoal();
		
		int opcao =0;
		
		String nome;
		int idade;
		double altura;
		String resposta;
		do{
			System.out.println("\n===MENU===");
			System.out.println("1) Cadastrar pessoa");
			System.out.println("2) Mostrar pessoa");
			System.out.println("3) Faz aniversario?");
			System.out.println("4) Sair");
			System.out.println("------------------------");
			opcao = ler.nextInt();
			
			switch(opcao){
				case 1:
					System.out.print("Nome: ");
					nome = leia.nextLine();
					System.out.print("Idade: ");
					idade = ler.nextInt();
					System.out.print("Altura: ");
					altura = ler.nextDouble();
					System.out.print("\nDados corretos[S/N]");
					resposta = leia.nextLine();
					//if(resposta.equalsIgnoreCase("s"))
					if(resposta.toUpperCase().charAt(0) == 'S'){
						pessoal.setNome(nome);
						pessoal.setIdade(idade);
						pessoal.setAltura(altura);
					}
					break;
				case 2:
					System.out.println(pessoal);
					break;
				case 3:
					System.out.print("Esta fazendo aniversario[S/N]");
					resposta = leia.nextLine();
					pessoal.fazAniversario(resposta.equalsIgnoreCase("s"));
					break;
				case 4:
					System.out.println("\n\tFim do programa!!!!!!!!!!");
					break;
				default:
					System.out.println("\n\tOpcao invalida!!!!!!");
			}
		}while(opcao != 4);
		
	}
}

