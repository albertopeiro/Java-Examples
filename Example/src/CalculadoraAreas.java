import java.util.*;
import javax.swing.*;
public class CalculadoraAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");
		
		int figura=entrada.nextInt();
		
		switch (figura){
		
		case 1: 
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); 
			
			System.out.println("El �rea de la figura es " + Math.pow(lado, 2));
			
			break; //siempre que se acaba el case, toca poner break
		
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea de la figura es " + base*altura);
			
			break;
			
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			// ya estan definidas, no hace falta poner Int otra vez, s�lo cambiarles el valor
			System.out.println("El �rea de la figura es " + base*altura*0.5);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El �rea del c�rculo es ");
			System.out.printf("%1.2f", Math.PI*Math.pow(radio, 2));
			
			break;
		
		default :
			System.out.println("La opci�n no es correcta");
			
		}
	}

}
