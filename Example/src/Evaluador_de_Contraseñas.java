import javax.swing.*;
public class Evaluador_de_Contraseņas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Conchita";
				
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa que por cierto es Conchita");
			
		if (clave.equals(pass)==false){
			
			System.out.println("Contraseņa incorrecta idiota");
			}
			
		}
		System.out.println("Contraseņa correcta! Muuuu bieng");
	
	}

}
