import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner entrada=new Scanner(System.in);
    
		System.out.println("Introduce tu edad, por favor");
    
		double edad=entrada.nextDouble();
		
		
		//Condicion simple
		
    // si la condici�n no se cumple, Java ignora el c�digo entre llaves
		
		//if(edad>=18.00){
			
			//System.out.println("Eres mayor de edad");
		//}
		//else{
			
			//System.out.println("Eres menor de edad, no te vendo alcohol capullo");
		//}
		
		
		//Condici�n m�ltiple
		 if (edad<18){
			 System.out.println("Eres menor");	 
		 }
		 else if (edad<40){
			 System.out.println("Eres mayor de edad, pero joven"); 
		 }
		 else if (edad<65){
			 System.out.println("Ya queda poco pa jubilarte eeeh"); 
		 }
		 else {
			 System.out.println("Viejaco");
		 }
	}

}
