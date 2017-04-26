package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class BuscadorFuente {

	public static void main(String[] args){
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente=false;
		
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//con esto cogemos todas las fuentes instaladas en el equipo local
		
		for(String n: nombresDeFuentes){

			if(n.equalsIgnoreCase(fuente)){
				
				estalafuente=true;
			}
		}
		
		if(estalafuente){
				System.out.println("Esta la fuente");
		}
		
		else{
				System.out.println("No esta la fuente, hay que instalarla");
		}
		
	}
}
