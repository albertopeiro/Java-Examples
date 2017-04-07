package poo;
import javax.swing.JOptionPane;

public class Array_preguntas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] paises=new String[17];
		
		for(int i=0; i<paises.length; i++){
		paises[i]=JOptionPane.showInputDialog("Introduce la pregunta " + (i+1));
		}
	String seguimos ="";
		while (seguimos.equalsIgnoreCase("no")==false){
		int j=(int) Math.random()*paises.length;
		seguimos=JOptionPane.showInputDialog(paises[j]+ "Seguimos?");
		
		}
	
	}

}
