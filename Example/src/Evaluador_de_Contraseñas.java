import javax.swing.*;
public class Evaluador_de_Contrase�as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Conchita";
				
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a que por cierto es Conchita");
			
		if (clave.equals(pass)==false){
			
			System.out.println("Contrase�a incorrecta idiota");
			}
			
		}
		System.out.println("Contrase�a correcta! Muuuu bieng");
	
	}

}
