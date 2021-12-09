public class Vagas {
	
	private String descricao;
	private double salario;
	
	public Vagas() {
		//mil desculpa senhor, mas como os comercios ficam ate as 10 eu to sem tempo pra terminar a lista... mas eu fiz DL da pdf eu vou tentando nas ferias...
	}
	public Vagas(String descricao, double salario){
		setDescricao(descricao);
		setSalario(salario);
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getDescricao(){
		return descricao;
	}
	public double getSalario(){
		return salario;
	}
	
}

