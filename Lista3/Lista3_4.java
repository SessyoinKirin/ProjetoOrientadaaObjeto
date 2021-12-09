import java.util.Scanner;
import java.util.Arrays;
public class Lista3_4 {
	
	static double compMaior(double n1, double n2){
		if(n1>n2){
			return n1;
		}else{
			return n2;
		}
	}
	
	static double compMenor(double n1, double n2){
		if(n1<n2){
			return n1;
		}else{
			return n2;
		}
	}
	
	static double mediaMaior(double n1, double n2, double n3){
		double arroy[] = {n1, n2, n3};
		Arrays.sort(arroy);
		return (arroy[1]+arroy[2])/2;
	}
	
	static double mediaArit(double n1, double n2, double n3){
		return (n1+n2+n3)/3;
	}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, maior, menor, media;
		
		System.out.print("Entre com a nota1: ");
		n1 = ler.nextDouble();
		if(n1>10){
		n1 = 0;	
		}
		System.out.print("Entre com a nota2: ");
		n2 = ler.nextDouble();
		if(n2>10){
		n2 = 0;	
		}
		maior = compMaior(n1, n2);
		menor = compMenor(n1, n2);
		System.out.print("Entre com a nota3: ");
		n3 = ler.nextDouble();
		if(n3>10){
		n3 = 0;	
		}
		maior = compMaior(maior, n3);
		menor = compMenor(maior, n3);
		
		System.out.println("Media maiores: "+mediaMaior(n1, n2, n3));
		System.out.println("Media aritmetica: "+mediaArit(n1, n2, n3));
		System.out.println("Maior nota: "+maior);
		System.out.println("Menor nota: "+menor);
	}
}

