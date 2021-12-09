public class Lampada {
	
	private String modelo;
	private boolean estado;
	
	public Lampada(){
		//estado = true;
	}
	@Override
	public String toString(){
		return "Modelo: "+modelo+" , estado: "+(getEstado()?"ligado":"fechado");
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setEstado(boolean estado){
		this.estado= estado;
	}
	
	public String getModelo(){
		return modelo;
	}
	public boolean getEstado(){
		return estado;
	}
	
	
}

