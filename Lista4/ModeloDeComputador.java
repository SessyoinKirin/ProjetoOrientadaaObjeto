public class ModeloDeComputador {
	
	private double placaMae;
	private double processadores;
	private double memoria;
	private double discoRigido;
	private double monitor;
	
	public ModeloDeComputador(){
		placaMae = 0.0;
		processadores = 0.0;
		memoria = 0.0;
		discoRigido = 0.0;
		monitor = 0.0;
	}
	
	public void setPlacaMae(double placaMae){
		this.placaMae = placaMae;
	}
	public void setProcessadores(double processadores){
		this.processadores = processadores;
	}
	public void setMemoria(double memoria){
		this.memoria = memoria;
	}
	public void setDiscoRigido(double discoRigido){
		this.discoRigido = discoRigido;
	}
	public void setMonitor(double monitor){
		this.monitor = monitor;
	}
	public double getPlacaMae(){
		return placaMae;
	}
	public double getProcessadores(){
		return processadores;
	}
	public double getMemoria(){
		return memoria;
	}
	public double getDiscoRigido(){
		return discoRigido;
	}
	public double getMonitor(){
		return monitor;
	}
	public double soma(){
		return getPlacaMae()+getProcessadores()+getMemoria()+getDiscoRigido()+getMonitor();
	}
}

