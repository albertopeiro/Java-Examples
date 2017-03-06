import java.util.*;
public class Adivina_el_Numerito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Numerito=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int Numero=0;
		
		int intentos=0;
		
		do{
			System.out.println("Llevas " + intentos + " intentos.");
			
			System.out.println("Introduce un número por favor");
			Numero=entrada.nextInt();
			
			if(Numerito<Numero){
				
				System.out.println("Más bajo");
			}
			else if(Numerito>Numero){
				
				System.out.println("Más alto");
				
			}
			intentos++;
			
		}while(Numero!=Numerito);
			
		System.out.println("Match! :)"+"\nLo has conseguido en " + intentos + " intentos");
	}

}
