import javax.swing.JOptionPane;

public class Array_paises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises=new String[8];
		
		for(int i=0; i<paises.length; i++){
		paises[i]=JOptionPane.showInputDialog("Introduce el país " + (i+1));
		}
	
		for(String elemento:paises){
		System.out.println("Pais: " + elemento);
		}
	
	
	}

}
