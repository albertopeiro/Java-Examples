package poo;

import java.util.Scanner;

public class Coche {
//propiedades comunes a todos los objetos de tipo coche
	private int ruedas, largo, ancho, motor, peso_plataforma;
	//
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	// Método público para ser capaces de averiguar como de largo es el coche desde cualquier otra clase
	public String dime_largo(){ //Getter (return)
		
		return "El largo del coche es " + largo;	
	}
	
	public void establece_color(String color_coche){ //Setter (void)
		
		color=color_coche;
	}
	
	public String dime_color(){ //Getter (return)
			
			return "El color del coche es " + color;
	}
	
	public void asientos(String asientos_cuero){// SETTER
		// this.asientos_cuero=asientos_cuero; 
//	This. es para decirle, cuando una variable tiene el mismo nombre que un argumento, cual es la variable
//	Pero, da error porque una variable String no puede ser igual a una de boolean!
		if(asientos_cuero.equalsIgnoreCase("si")){
		this.asientos_cuero=true;
		}
		else{
		this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos(){
		
		if(asientos_cuero==true){
		//Aqui no hace falta el this porque no hay argumento, JAVA ya sabe que te estas refiriendo a la variable
		
		return "El coche tiene asientos de cuero";
		}
		else{
			
		return "El coche tiene asientos de serie";	
		}
	}
	
	public void configura_climatizador(String climatizador){
		if(climatizador.equals("si")){
		this.climatizador=true;
		}
		else{
		this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){
		
		if(climatizador==true){
			
			return "El coche lleva climatizador";
		}
		else{
			return "El coche lleva aire acondicionado";
			
		}
	}
	
	//Esto es un SETTER y GETTER a la vez, aunque no esta recomentado!!
	public String dime_peso_total(){ //SETTER+GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true){
			
			peso_total=peso_total+50;
		}
		if (climatizador==true){
			peso_total=peso_total+20;
		}
		return "El peso total es de " + peso_total +" kg.";
		
	}
	
	public String precio_coche(){
		
		int precio_final=10000;
		
		if(asientos_cuero==true){
		
			precio_final+=2000;
		}
		if (climatizador==true){
			precio_final+=1500;
		}
		
		return "Serán " + precio_final + " euros, por favor.";
		
	}
	}

