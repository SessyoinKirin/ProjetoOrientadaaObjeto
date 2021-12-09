public class Pessoal {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoal(){
		this.nome = "Terizla";
		this.idade = 15;
		this.altura = 1.47;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public double getAltura(){
		return altura;
	}
	public void fazAniversario(boolean faz){
		if(faz){
			idade++;
		}
	}
	@Override
	public String toString(){
		return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nAltura: "+getAltura();
	}
}

