public class Empregado extends Pessoa {
	
	private String nomeDaEmpresa;
	
	public Empregado() {
		super();
	}
	
	public Empregado(String nome, int idade){
		super(nome, idade);
	}
	
	public void setNomeDaEmpresa(String nomeDaEmpresa){
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public String getNomeDaEmpresa(){
		return nomeDaEmpresa;
	}
	
	@Override
	public String toString(){
		return "Senhor(a): "+getNome()+", empregado no "+getNomeDaEmpresa()+".";
	}
}

