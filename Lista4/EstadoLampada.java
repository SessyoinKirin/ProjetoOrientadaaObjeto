public class EstadoLampada {
	
	private String estado1;
	private String estado2;
	private String estado3;
	
	public EstadoLampada(){
		estado1 = "apagada";
		estado2 = "acesa";
		estado3 = "meia-luz";
	}
	
	public String setEstado1(){
		return estado1;
	}
	public String setEstado2(){
		return estado2;
	}
	public String setEstado3(){
		return estado3;
	}
	
	public String getEscolha(int num){
		switch(num){
			case 1: 
				return getEstado1();
				break;
			case 2: 
				return getEstado2();
				break;
			case 3: 
				return getEstado3();
				break;
			default:
				System.out.println("Erros!");
		}
	}
}

