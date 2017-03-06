import javax.swing.JOptionPane;

public class Comprueba_Mail_Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean arroba=false;
		
		String email=JOptionPane.showInputDialog("Introduce tu dirección de correo electrónico");
		
		
		for( int i=0; i<email.length(); i++ ){
			
			if (email.charAt(i)=='@'){
				arroba=true;			
			}
		
		}
		if(arroba==true){
			System.out.println("Currecte");
		}
		else{
			System.out.println("INcurrecte");
		}
		
	}

}
