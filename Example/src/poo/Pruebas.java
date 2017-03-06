package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creamos instancias de clase/objetos de tipo empleado en la clase principal
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3=new Empleados("Martín");
		
		//trabajador2.cambiaNombre("Culo");
		trabajador2.cambiaSeccion("Limpieza");
		
		System.out.println(trabajador1.devuelveDatos()
+ "\n" + trabajador2.devuelveDatos()
+ "\n" + trabajador3.devuelveDatos());
	
		System.out.println(Empleados.dameIdSiguiente());
	}

}
//Nueva clase
class Empleados{
	
	//Constructor. Da un estado inicial, el nombre será distinto pero 
	//en un principio todos pertenecerán a la sección de administración
	public Empleados(String nom){
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	/*
	//Setter para cambiar el nombre, antes de declararlo como final. Ahora dará error
	public void cambiaNombre(String nombre){

	this.nombre=nombre;
	}
	*/
	
	
	
	//Setter para cambiar de sección con el tiempo
	public void cambiaSeccion(String seccion){
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos(){
		
		return "El nombre del empleado es: " + nombre + ", la sección es " + seccion + " y el ID es " + Id;
		}
	
	public static String dameIdSiguiente(){
		return "El Id siguiente es: " + IdSiguiente;
	}
	
	
	
	//Campos de clase
	private final String nombre;
	
	private String seccion;
	
	private int Id; //Cursiva es para confirmar el Static
	// Id no es una variable propia de cada objeto. Es una variable de clase propiamente (compartida entre los de la clase)
	private static int IdSiguiente=1;

}