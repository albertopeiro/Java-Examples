import javax.swing.*;
public class Evaluador_de_Contraseñas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Conchita";
				
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña que por cierto es Conchita");
			
		if (clave.equals(pass)==false){
			
			System.out.println("Contraseña incorrecta idiota");
			}
			
		}
		System.out.println("Contraseña correcta! Muuuu bieng");
	
	}

}
