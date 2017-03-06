package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Éste código es válido pero largo, vamos a intentar algo más corto aunque más complejo abajo
		Empleado empleado1=new Empleado("Paco Cifuentes",30000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana Lopez",28000, 1995, 6, 2);
		Empleado empleado3=new Empleado("Martín Maria",35000, 2002, 3, 15);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre()
		+ "    Sueldo: "+ empleado1.dameSueldo()
		+ "    Fecha de Alta: " + empleado1.dameFechaAlta());
		System.out.println("Nombre: " + empleado2.dameNombre()
		+ "    Sueldo: "+ empleado2.dameSueldo()
		+ "    Fecha de Alta: " + empleado2.dameFechaAlta());
		System.out.println("Nombre: " + empleado3.dameNombre()
		+ "    Sueldo: "+ empleado3.dameSueldo()
		+ "    Fecha de Alta: " + empleado3.dameFechaAlta());
	*/
		Jefatura jefe_RRHH= new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[6];

		misEmpleados[0]=new Empleado("Paco Cifuentes", 30000,1990,12,17);
		misEmpleados[1]=new Empleado("Ana Lopez", 28000,1995,6,2);
		misEmpleados[2]=new Empleado("Martín Maria", 35000,2002,3,15);
		misEmpleados[3]=new Empleado("Antonio Fernández");
		misEmpleados[4]=jefe_RRHH; //He aquí el polimorfismo.
		misEmpleados[5]=new Jefatura("María",95000,1999,5,26);
		//Aquí un casting o refundición para darle un incentivo a Maria
		Jefatura jefa_finanzas=(Jefatura) misEmpleados[5];
		jefa_finanzas.estableceIncentivo(55000);
		jefa_finanzas.establece_bonus(500);
		
		
		/*Empleado director_comercial=new Jefatura ("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo=new Empleado("Elisabeth", 95000, 2011, 06,07);
		
		if(director_comercial instanceof Empleado){
			System.out.println("Es de tipo Empleado");	
		}
		
		if(ejemplo instanceof Comparable){
			System.out.println("Implementa la interfaz comparable");
		}*/
		
	/*  Con esto el código se reduce bastante, y aún mejor con el bucle for mejorado:
		for(int i=0;i<misEmpleados.length;i++){
			misEmpleados[i].subeSueldo(5);
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
			+ "    Sueldo: "+ misEmpleados[i].dameSueldo()
			+ "    Fecha de Alta: " + misEmpleados[i].dameFechaAlta());
		}*/
		
		System.out.println(jefa_finanzas.tomar_decisiones("despedir a Paco por inútil."));
		
		for(Empleado e:misEmpleados){
			e.subeSueldo(5);
			
		Arrays.sort(misEmpleados);
			
			System.out.println(
			"Nombre: " + e.dameNombre()
			+ "    Sueldo: "+ e.dameSueldo()
			+ "    Fecha de Alta: " + e.dameFechaAlta()
			);
		}
	}
}

class Empleado implements Comparable, Trabajadores {
	public Empleado(String nom, double sue, int anyo, int mes, int dia){
nombre=nom;

sueldo=sue;

// Enero es el mes=0 y Dic=11
GregorianCalendar calendario=new GregorianCalendar(anyo,mes-1,dia);
altaContrato=calendario.getTime();
	}
	
	public Empleado(String nom){
		
		nombre=nom;
		this.sueldo=30000;
		GregorianCalendar calendario=new GregorianCalendar(2000,0,1);
		this.altaContrato=calendario.getTime();
	}
	
	public double establece_bonus(double extra){
		
		return Trabajadores.bonus_base+extra;
	}
	
	public String dameNombre(){ //GETTERS
		return nombre;
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
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado=(Empleado) miObjeto; //Refundición o vasting del tipo de variable, de Object a Empleado
				
				if(this.sueldo<otroEmpleado.sueldo){
					
					return -1; // Estos son los return que necesita el método Arrays.sort
				}
				if(this.sueldo>otroEmpleado.sueldo){
					
					return 1;
				}
				
				else {
					return 0;
				}
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	
}

final class Jefatura extends Empleado implements Jefes{
	//Constructor de la nueva clase
	public Jefatura (String nom, double sue, int anyo, int mes, int dia){
		//Aun así hay que llamar al constructor de la clase padre
		//Hay dos clases empleado, una solo con el nombre y la otra con los 5 parámetros
		//Hay que especificar la clase a la que estas llamando
		//Así que se necesita copiar los parametros que se introducen en la clase empleado que estas llamando
		super(nom, sue, anyo, mes, dia);
		
	}
			
		public void estableceIncentivo(double b){
			
		incentivo=b;	
			
		}
		
		public double dameSueldo(){
			
			double sueldoJefe=super.dameSueldo();
			return sueldoJefe + incentivo;
		}
	
		public String tomar_decisiones (String decision){
			
		return "Un miembro de la dirección ha tomado la decisión de " + decision;
		
		}
		public double establece_bonus(double extra){
			
			double prima=2000;
			
			return Trabajadores.bonus_base+prima+extra;
		}
		
		private double incentivo;
}


