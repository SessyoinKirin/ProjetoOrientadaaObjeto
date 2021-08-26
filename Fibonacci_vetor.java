public class Fibonacci_vetor {
	
	public static void main (String[] args) {
		
		int a=0, b=1, c;
		//int v[] = new int[20];
		for(int i=1; i<=20; i++){
			System.out.print(a+" ");
			//v[g++]= a;
			c=b+a;
			a=b;
			b=c;
			}
			System.out.println();
		/*for(int i=0; i<v.length; i++){
			System.out.print(v[i]+" ");
			}*/
		
	}
}
