package poo;

public class Furgoneta extends Coche{

	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		
		super();//Llama al constructor de la clase padre
	
	this.capacidad_carga=capacidad_carga;
	
	this.plazas_extra=plazas_extra;
	
	
	}
	
	public String dimeDatosFurgoneta(){
		
return "La capacidad de carga es: " + capacidad_carga + " kg y tiene " + plazas_extra + " plazas."; 		
		
	}
}
