public class Desempregado extends Pessoa {
	
	private int mesDesemprego;
	
	public Desempregado() {
		super();
	}
	public Desempregado(String nome, int idade){
		super(nome, idade);
	}
	public void setMesdesemprego(int mesDesemprego){
		this.mesDesemprego = mesDesemprego;
	}
	public int getMesdesemprego(){
		return mesDesemprego;
	}
	
	@Override
	public String toString(){
		return "Senhor(a): "+getNome()+", desempregado(a) por "+getMesdesemprego()+" meses.";
	}
	
}

