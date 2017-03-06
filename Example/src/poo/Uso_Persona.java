package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis", 50000, 2007, 2, 25);
		lasPersonas[1]=new Alumno("Jose", "Ingeniería Química");
		
		
		for(Persona e:lasPersonas){
		
			System.out.println(e.dameNombre() + e.dameDescripcion());
		}
		
	}

}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom){
		
		nombre=nom;
	}
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion();
}
class Empleado2 extends Persona{
	public Empleado2(String nom, double sue, int anyo, int mes, int dia){
super (nom);
sueldo=sue;

// Enero es el mes=0 y Dic=11
GregorianCalendar calendario=new GregorianCalendar(anyo,mes-1,dia);
altaContrato=calendario.getTime();

++IdSiguiente;
Id=IdSiguiente;
	}
	
	public String dameDescripcion(){
		
		return " El Id de este empleado es " + Id + " y un sueldo de "+ sueldo;
	}
	
	public double dameSueldo(){
		return sueldo;
	}
	
	public Date dameFechaAlta(){
		return altaContrato;
	}
//	Puedo escribir tal cual y al acabar pulsar control 7 para que se haga comentario :) 
	public void subeSueldo (double porcentaje){ //Setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	

}

class Alumno extends Persona{
	
	public Alumno(String nom, String car){
		super (nom);
		carrera=car;
		
	}
	public String dameDescripcion(){
		
		return " Este alumno está estudiando " + carrera;
	}
	private String carrera;
}
